/** Roberto Andino
 *  File: Pile.java
 *  Creates a pile that has a random number of marbles between 20-95
 *  Has get() method to return current number marbles in the pile
 *  Has remove() method that removes marbles from the pile
 * 
 *  I affirm that this program is entirely my own work and none of it is the 
 *  work of any other person.
 */
package assignment4;

import java.util.*;

public class Pile {
    
    private Random rand = new Random(); //to create random number
    private int pile = 0; //to store marbles

    /**
     * Initialize pile to a random value between 20-95
     */
    public Pile()
    {        
        pile = rand.nextInt(75) + 20; //giving pile a random value between 
                                      //20 - 95       
    }
    
    /**
     * returns current number of marbles in pile
     * @return current number of marbles in pile
     */
    public int get()
    {
        return pile; //returning current number of marbles in pile
    }
    
    /**
     * removes number of marbles from pile
     * @param removeM receives number of marbles to remove from pile 
     */
    public void remove(int removeM)
    {
        pile = pile - removeM; //subctracting marbles from pile
      
    }
    
    
}
