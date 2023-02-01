/** Roberto Andino
 *  File: Nim.java
 *  Creates pile object and has method play(), that conducts the game.
 *  Method play() receives player objects from main class and int turn
 * 
 *  I affirm that this program is entirely my own work and none of it is the 
 *  work of any other person.
 */
package assignment4;


public class Nim {

    private Pile marbles;

    /**
     * creates Pile object
     */
    public Nim()
    {
        marbles = new Pile();
    }

    /**
     * Conducts the game
     * @param player1 //Interface Player object to call its methods
     * @param player2 //Interface Player object to call its methods
     * @param turn to check which player goes first 
     */
    public void play(Player player1, Player player2, int turn) 
    {

        int marblesRem; //to get how many marbles each player removes

        System.out.println("\nThere are " + marbles.get() + " marbles in "
                + "pile\n\n");

        //do while loop to run game while pile of marbles has marbles
        do {
            
            //if turn = 1, player1 goes first
            if (turn == 1) {

                System.out.println(player1.playerName() + " turn\n");
                
                //passing pile of marbles to current player that implements 
                //interface method move, which returns how many marbles have to 
                //be removed
                marblesRem = player1.move(marbles.get()); //polymorphism
               
                marbles.remove(marblesRem); //passing how many marbles have to 
                                            //be removed to method remove of 
                                            //class Pile

                System.out.print(player1.playerName() + " has removed " + 
                                 marblesRem +  " marbles" + "\n");
                System.out.println("There are now " + marbles.get() + 
                                    " marbles" + "\n");
                
                //if there is only 1 marble left then player 1 is winner
                if (marbles.get() == 1) {
                
                    System.out.println("---- " + player1.playerName() +   
                                         " is the winner ----\n");
                    System.out.println(player2.playerName() + " removes last "
                                       + "marble and loses game\n\n");
                
                    break; //to end loop
                }
            
                turn++; //incrementing turn to 2 so player 2 plays

            }

           
            //if turn = 2, player2 goest first
            if (turn == 2) {

                System.out.println(player2.playerName() + " turn\n");

                //passing pile of marbles to current player that implements 
                //interface method move, which returns how many marbles need 
                //to be removed
                marblesRem = player2.move(marbles.get()); //polymorphism 
                
                marbles.remove(marblesRem); //passing how many marbles have to 
                                            //be removed to method remove of 
                                            //class Pile

                System.out.print(player2.playerName() + " has removed " + 
                                 marblesRem +  " marbles" + "\n");
                System.out.println("There are now " + marbles.get() + 
                                   " marbles" + "\n");
                
                //if there is only 1 marble left then player 2 is winner
                if (marbles.get() == 1) {
                
                    System.out.println("---- " + player2.playerName() + 
                                        " is the winner ----\n");
                    System.out.println(player1.playerName() + " removes last "
                                       + "marble and loses game\n\n");
                    break; //to end loop
                }
                
                turn = 1; //setting turn to 1 so player 1 plays
            }

        } while (marbles.get() > 0);

    }

}
