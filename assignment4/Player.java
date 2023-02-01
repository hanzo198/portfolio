/** Roberto Andino
 *  File: Player.java
 *  Creates Interface Player that has abstract method move() that returns
 *  marbles taken from pile, and playerName() that returns players name.
 *  Has 3 players classes that implement interface Player.
 *
 *  I affirm that this program is entirely my own work and none of it is the
 *  work of any other person.
 */
package assignment4;

import java.util.Random;
import java.util.Scanner;

/**
 * An Interface implemented by 3 types of players classes
 */
public interface Player {

    int move(int marbles); //returns number of marbles taken

    String playerName(); //returns players name

}

/**
 * Implements interface player Returns amount of marbles taken from pile and
 * players name
 */
class Human implements Player {

    private String name; //to get players name

    /**
     * initialize String name
     *
     * @param name2 receives players name
     */
    public Human(String name2) {
        name = name2; //initialize name
    }

    /**
     * Ask human to enter amount of marbles to be removed
     *
     * @param marbles receives amount of marbles in pile
     * @return number of marbles to remove from pile
     */
    public int move(int marbles) {
        int remove; //to get number of marbles that human wants to remove
        int div;    //to get half of marbles in pile

        Scanner input = new Scanner(System.in); //to get user input

        div = marbles / 2; //diving pile of marbles by 2

        System.out.println("You can remove as much as " + div + " marbles");
        System.out.println("Enter the number of marbles to be removed: ");
        remove = input.nextInt();
        System.out.println();

        //While loop so human does not cheat
        //if amount entered by human is more than half of pile or if its less
        //less than amount of marbles in pile then move is illegal
        while (remove > div || remove < 1) {
            System.out.println("Must remove 1 but no more than half of current"
                    + "pile of marbles\n " + "TRY AGAIN!!! \n");
            System.out.println("You can remove as much as " + div + " marbles");
            System.out.println("Enter the number of marbles to be removed: ");
            remove = input.nextInt();
        }

        return remove; //returning marbles to be removed
    }

    /**
     * to return players name
     *
     * @return players name
     */
    public String playerName() {

        return name; //returns players name

    }

}

/**
 * Implements interface player Returns amount of marbles taken from pile and
 * players name
 */
class SmartComputer implements Player {

    private String name; //to get players name

    /**
     * initialize String name
     *
     * @param name2 receives players name
     */
    public SmartComputer(String name2) {
        name = name2; //initialize name
    }

    /**
     * removes enough marbles to make the remaining pile size a power of 2 - 1
     *
     * @param marbles receives amount of marbles in pile
     * @return number of marbles to remove from pile
     */
    public int move(int marbles) {

        int remove; //to return marbles that have to be removed
        int counter; //to increment power to next number
        int power; //to set power of 2
        Random rand = new Random(); //to get random number

        //if marbles is less than 3 then just return 1
        if (marbles > 3) {

            counter = 1; //initiliazing counter
            
            //initiliazing power to 2 ^ 1 - 1 = 1
            power = (int) Math.pow(2, counter) - 1;
            
            //while loop to set power to an int that is a power of 2 - 1
            while (power < marbles) {
                
                counter++; //incrementing counter
                
                //power = 2 ^ counter - 1
                power = (int) Math.pow(2, counter) - 1;
            
            }
            
            //check if marbles in pile are a power of 2 - 1
            if (marbles == power) {
                
                //remove = random int between 1 and half of pile
                remove = rand.nextInt(marbles / 2) + 1;
            
            } else {
                
                //remove = difference between current marbles in pile
                //and one less than last power
                remove = marbles - ((int) Math.pow(2, counter - 1) - 1);
            }

            return remove; //return marbles to remove
        }
        
        return 1; //return 1 if pile is less than 3
    }

    /**
     * to return players name
     *
     * @return players name
     */
    public String playerName() {

        return name; //returns players name
    }
}

/**
 * Implements interface player Returns amount of marbles taken from pile and
 * players name
 */
class BelowAvgComputer implements Player {

    private String name; //to get players name

    /**
     * initialize String name
     *
     * @param name2 receives players name
     */
    public BelowAvgComputer(String name2) {
        name = name2; //initialize name
    }

    /**
     * removes a random number of marbles between 1 and half of pile
     *
     * @param marbles receives amount of marbles in pile
     * @return number of marbles to remove from pile
     */
    public int move(int marbles) {
        Random rand = new Random(); //random  generator

        int remove = rand.nextInt(marbles / 2) + 1; //getting random number 
        //between 1 and half of 
        //pile

        return remove; //returning marbles to be removed
    }

    /**
     * to return players name
     *
     * @return players name
     */
    public String playerName() {

        return name; //returns players name

    }
}
