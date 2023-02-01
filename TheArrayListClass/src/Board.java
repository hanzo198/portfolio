// Roberto Andino
// File: Board.java
// The Hand class creates a new board containing a single numbertile, it later 
// more tiles to the board if possible and returns the multiline string 
// containing all tiles on this board.

import java.util.ArrayList;

// The board for the NumberTile game  
public class Board
{
    private ArrayList<NumberTile> board ;    // the board for a NumberTile game
    
    /**
     * Creates a new Board containing a single NumberTile
     */
    public Board()
    {
        board = new ArrayList<>();
        
        board.add(new NumberTile());
            
    }
    
    /**
     * Returns numberTile at specified index on this board
     * @param index used to return NumberTile at a specified index on this board
     * @return board.get(index) returns numberTile at specified index on this board
     */
    public NumberTile getTile (int index)
    {  
       return board.get(index);   
    }
    
    /**
     * returns current number of tile on this board
     * @return board.size() returns current number of tile on this Board
     */
    public int getSize()
    {
       return board.size();
    }
    
    /**
     * Inserts a new tile into this Board at the specified index
     * @param index used to store new tile into this board at the specified index
     * @param tile used to get new number tile from class NumberTile
     */
    public void addTile(int index, NumberTile tile)
    {
        board.add(index, tile);
    }
    
    /** Returns a multiline string containing all the tiles on this Board
     * @return the multiline string containing all tile on this board
     */
    public String toString()
    {
        return board.toString();
    }           
}