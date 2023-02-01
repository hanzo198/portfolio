// Roberto Andino
// File: Tilegame.java
// Implements a domino-like game where two players, both of whom are
// the computer, take turns inserting NumberTiles into a Board

public class TileGame
{
   // instance vars
   Board board ;     // the game board
   Hand hand1 ;      // Player 1 hand
   Hand hand2 ;      // Player 2 hand
   String winner ;   // the winner - player1, player2, or a tie game
   
   /** 
    * Creates a new TileGame with two initial hands and a board 
    * @param firstHand used to assign hand1 object to it
    * @param secondHand used to assign hand2 object to it
    */
   public TileGame(Hand firstHand, Hand secondHand)
   {
      firstHand = hand1 = new Hand();
      secondHand = hand2 = new Hand();
       
      board = new Board();
        
   }
   
   /**
    * Players take turn moving until one or both hand are empty
    */
   public void play()
   {
       //turn is used to determine which players turn it is.
       int turn = 1;
    
       //giving value "go" to string winner for while loop
       winner = "go" ;
              
       //While statement to keep track of players turn and which hand is empty
       while(winner == "go")
       {    
          //if else statement to check player's turn 
          if(turn == 1){
              makeMove(hand1);
          }else {
              makeMove(hand2);
          }
           turn++;
           
          if(turn == 3){
               turn = 1;
          }
           
          //if else statement to check which hand is empty using String winner
          if(hand1.getSize() == 0 && hand2.getSize() == 0)
          {
               winner = "tie";
          }else if(hand1.getSize() == 0){
               winner = "1";
          }else if(hand2.getSize() == 0){
               winner = "2";
          }else{
               winner = "go";
          }   
        }   
       
        System.out.print("\n\n\n");
                      
   }
   
   /**
    * Utility method called by method makeMove.  Returns the index at which a
    * new tile will be inserted into the board, or -1 if the tile cannot
    * be inserted.  The new tile may be inserted either (1) between two 
    * existing tiles, (2) as the new first tile, or (3) as the new last tile
    * @param tile To get number tile from NumerTile class
    * @return to return the size, i, or -1 to check if new tile can be inserted and where
    */
   
   private int getIndexForFit(NumberTile tile)
   {
       //size used to get size of method
       int size = board.getSize();
       
       //for loop and if else statements to check where new tile can be inserted
       for(int i = 0; i < size; i++)
       {
           if(i == 0)
           {
               if(tile.getRight() == board.getTile(0).getLeft())
               {
                   return i;
               }
           }
           
           if(i == size - 1)
           {
               if(tile.getLeft() == board.getTile(size - 1).getRight())
               {
                   return size;
               }
           }else if(tile.getLeft() == board.getTile(i).getRight() 
                    && tile.getRight() == board.getTile(i + 1).getLeft())
            {
                return i;
            }
          
       }       
       
      // return -1 if tile can't be inserted 
      return -1 ;
   }

   /**
    * Utility method called by method play().  Checks consecutive tiles in the 
    * hand - by calling method getIndexForFit() - to see if one can be inserted 
    * into the board. When the first tile that fits is found, removes it from
    * the hand, inserts it into the board, and the move ends.  The tile may be
    * rotated up to 3 times. If none of the tiles fit, adds a new, random tile
    * to the hand 
    * @param hand used to get size, add tiles, remove tiles, get tiles from Hand class
    */
   
   private void makeMove(Hand hand)
   {
       
       //for loop to check hand size
       for(int i = 0; i < hand.getSize(); i++)
       {
           NumberTile tile = hand.get(i);
           
           //Assignning return value of getIndexForFit to int index
           int index = getIndexForFit(tile);
           //while loop counter
           int count = 0;
           
           //while loop to rotate tile 3 times 
           while(count < 3)
           {
               //if statement to add or/and remove tile at specified index
               if(index != -1)
               {
                   board.addTile(index, tile);
                   hand.removeTile(i);
                   
                   return;
               }
               
               //calling method rotate()  from NumberTile class to rotate tile
               tile.rotate();
               //setting index location
               index = getIndexForFit(tile);
               
               count++;
           }
       }
       
       //to add new tile to hand
       hand.addTile();
       
   }
   
   /**
   * Returns results of the game as a humongous multi-line String containing
   * the final board, both both player's final hands, and the winner
   * @return results returns the hand1, hand2, board and winner results
   */ 
   public String getResults()
   {
      
       StringBuilder results =  new StringBuilder();
       
       //if else statement to check if Player 1 hand is empty
       if(hand1.isEmpty())
       {
           results.append("****Player 1 Final Hand**** \n\n");
           results.append("[Empy]\n\n");
       }else{
           results.append("****Player 1 Final Hand**** \n");
           results.append(hand1 + "\n");
       }
      
       //if else statement to check if Player 2 hand is empty
       if(hand2.isEmpty())
       {
           results.append("****Player 2 Final Hand**** \n\n");
           results.append("[Empy]\n\n");
       }else{
            results.append("****Player 2 Final Hand**** \n");
            results.append(hand2 + "\n");        
       }
            
            results.append("****Final Board**** \n");
            results.append(board + "\n");
       
       //if else statement to check who is the winner using String winner
       if(winner == "tie"){
            
        results.append("\n\n****It's a Tie!!****");
           
        }else if(winner == "1"){
               
            results.append("\n\n****Winner is PLAYER 1!!****");
        
        }else if(winner == "2"){
            
            results.append("\n\n****Winner is PLAYER 2!!****");
        } 
               
       return results.toString();
   }
}
 // end of TileGame2 class