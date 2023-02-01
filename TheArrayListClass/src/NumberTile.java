// Roberto Andino
// File: NumberTile.java
// The numbertile class uses and arrayList to create a numberTile of 4 random 
// numbers. It also has the rotate method to rotate the numberTile and also
// creates a string in the form of:
//        9
//      3   7
//        6
        
        
import java.util.ArrayList ;
import java.util.Random;

// A NumberTile is a square tile with a number from 1 to 9 on each side
public class NumberTile 
{
    private ArrayList<Integer> tile ;    // the 4-sided tile
    private static final Random gen = new Random() ;
    
    /**
     * Create a NumberTile object with 4 random ints in the range 1 to 9
     */     
    public NumberTile() 
    {
       tile = new ArrayList<Integer>();
       
       //storing random numbers in arrayList
       for(int i = 1; i <= 4; i++)
       {
           tile.add(gen.nextInt(9));
       }
         
    }
    
    /**
     * Rotate this NumberTile 90 degrees
     */
    public void rotate() 
    {
        //tempValue used to store value of tile.get(0) so value doen't get lost
        int tempValue = tile.get(0);
        
        tile.set(0, tile.get(1));
        tile.set(1, tile.get(2));
        tile.set(2, tile.get(3));
        tile.set(3, tempValue);
        
        
    }
    
    /**
     * Return the number on the left side of this NumberTile
     * @return tile.get(0) returns number on left side of this numbeTile
     */
    public int getLeft()
    {
        return tile.get(0) ;
    }
    
    /**
     * Return the number on the right side of this NumberTile
     * @return tile.get(2) returns number on the right side of this numberTile
     */
     public int getRight() 
    {
        return tile.get(2) ;
    }
    
    /**
     * Return this NumberTile as a multiline string in the form:
     *   9
     * 3   7
     *   6
     * 
     * @return BoardTile returns the NumberTile as a string in the form: 
     *   9
     * 3   7
     *   6
     */
    public String toString() 
    {
       String BoardTile = "\n" + " " + tile.get(1) + "" + "\n" + tile.get(0) + 
                     " " + tile.get(2) + "\n" + " " + tile.get(3) + "" + "\n";
       
       return BoardTile;
               
    }    
} // end of NumberTile class
