// Roberto Andino
// File: Hand.java
// The Hand class creates a players hand containing 5 initial number tiles.
// It uses the getSize, addTile, removeTile, isEmpty to edit the players hand.

import java.util.ArrayList;

// A player's hand of NumberTiles
public class Hand
{
    private ArrayList<NumberTile> hand ;
    private final static int INITIAL_SIZE = 5 ;  // starting hand size
    
    /** 
     * Creates a new hand of INITIAL_SIZE NumberTiles 
     */
    public Hand()
    {
        
        hand =  new ArrayList<>();
        
        for(int i = 0; i < INITIAL_SIZE; i++)
        {
            hand.add(new NumberTile());
        }
        
    }
       
    /**
     * Gets the NumberTile at the specified index in this Hand
     * @param index used to return NumberTile at specified index
     * @return hand.get(index) returns numbertile at specified index in this hand
     */
    public NumberTile get(int index)
    {
       return hand.get(index);
    }
    
    /** 
     * Gets the number of tiles in this Hand
     * @return hand.size() returns number if tiles in this hand
     */
    public int getSize()
    {
       return hand.size();
    }
    
    /** 
     * Adds a new NumberTile to this Hand
     */
    public void addTile()
    {
        hand.add(new NumberTile());
    }
    
    /**
     * Remove the NumberTile at the specified index from this Hand
     * @param index used to remove the numberTile at specified index
     */
    public void removeTile(int index)
    {
        hand.remove(index);
    }
    
    /**
     * Checks if hand is empty
     * @return hand.isEmpty() returns a boolean to check if hand is empty 
     */
    public boolean isEmpty()
    {
        return hand.isEmpty();
    }
    
    /**
     * returns this Hand as a multiline String
     * If this Hand is empty, returns an appropriate message
     * @return hand.toString() returns this hand as multiline string 
     */
    public String toString()
    {
       //String check to check if hand is empty
       String check = " ";
       
       //for loop and if else statement to check if hand is empty
       for(int i = 0; i < hand.size(); i++)
       {
           if(hand.isEmpty())
           {
               check = "\n[Empty]\n";
           }else
               check = check + hand.get(i).toString() + "\n";
           
       }
       
       return check;
         
    }
}
