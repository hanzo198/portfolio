/** Roberto Andino
 *  File: ArrayRecursion.java
 *  This program performs simple array operations recursively
 *
 *  I affirm that this program is entirely my own work and none of it is the
 *  work of any other person.
 */
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * A class that performs some simple array operations recursively
 */
public class ArrayRecursion {
    // instance var's

    private int[] list;       // array of ints
    private int count;         // number of elements

    /**
     * Create an ArrayRecursion object. Creates an array with between 10 and 15
     * elements, and fills it with random positive 2-digit ints
     */
    public ArrayRecursion() {
        Random r = new Random();
        count = r.nextInt(6) + 10;
        list = new int[count];

        for (int i = 0; i < count; i++) {
            list[i] = r.nextInt(90) + 10;
        }
    }

    /**
     * Return the list as a string
     *
     * @return a string containing all the ints stored in list
     */
    public String toString() {
        String out = "";
        for (int i = 0; i < count; i++) {
            out += list[i] + "  ";
        }
        return out + "\n";
    }

    /**
     * Returns the smallest value in the array.
     *
     * @return the smallest value in the array
     */
    public int getSmallest() {
        return recursiveGetSmallest(list, count);
    }

    /**
     * recursive "helper" method returns the smallest value in list called by
     * public method getSmallest()
     *
     * @param list array of ints
     * @param count size of array
     * @return minimum or base case to stop recursion
     */
    private int recursiveGetSmallest(int[] list, int count) {

        //base case
        if (count == 1) {
            return list[0];
        }

        //returing minimum int in array
        return Math.min(list[count - 1], recursiveGetSmallest(list, count - 1));

    }

    /**
     * Reverse the elements of the array
     */
    public void reverse() {
        recursiveReverse(list, 0, count);
    }

    /**
     * recursive "helper" method to reverse the array called by public method
     * reverse()
     *
     * @param list array of ints
     * @param first to get first value of array
     * @param count size of array
     */
    private void recursiveReverse(int[] list, int first, int count) {
        
        //base case
        if (count - 1 == first || count == first) {
            return;
        }

        //swap the ints
        int hold = list[first];

        list[first] = list[count - 1];

        list[count - 1] = hold;

        //recursion
        recursiveReverse(list, ++first, --count);

    }

    /**
     * Does the array contain two or more consecutive ints, ascending or
     * descending?
     *
     * @return true if array contains any consecutive ints; otherwise false
     */
    public boolean hasConsecutives() {
        return recursiveHasConsecutives(list, count);
    }

    /**
     * recursive "helper" method called by public method hasConsecutives()
     *
     * @param list array of ints
     * @param count size of array
     * @return false if not consecutive ints, or true if consecutive ints
     */
    private boolean recursiveHasConsecutives(int[] list, int count) {

        //Base case to stop recursion
        if (count == 1) {
            return false;
        }

        //compare ints to see if they are consecutive
        if (list[count - 1] - list[count - 2] == 1
                || list[count - 1] - list[count - 2] == -1) {

            return true;
        }

        //decrement
        count--;

        //recursion
        return recursiveHasConsecutives(list, count);

    }

    public static void main(String[] args) {
        ArrayRecursion list = new ArrayRecursion();

        System.out.println("\nOriginal:  " + list);

        System.out.println("Smallest value in the array is "
                + list.getSmallest());
        list.reverse();
        System.out.println("\nReversed:  " + list);

        System.out.println("The list "
                + (list.hasConsecutives() ? "has" : "does not have")
                + " consecutive ints in consecutive elements");
    }
}
