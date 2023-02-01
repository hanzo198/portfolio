/** Roberto Andino
 *  File: KnightTour.java
 *  Conducts tour by placing knight on tour and making it move until there are
 *  no more legal moves
 *  returns new tour
 *  Knows number of tours of each length
 *  Knows longest tour
 */

package assignment3;

import java.util.*;

public class KnightTour {

    private Chessboard chess; //creating Chessboard object
    private Chessboard bestBoard; //to get best board
    private int longestT; //int to get longest tour
    private int tourNumber = 0; //to get best tour number
    private int[] tours; //array  to get tour length and number
                         //of tours

    /**
     * initialize chess
     */
    public KnightTour() {

        tours = new int[64]; //initilaizing tours to 64
        bestBoard = new Chessboard(); //initializing bestBoard
        chess = new Chessboard(); //initializing chess
    }

    /**
     * Conducts tour. Creates Chessboard and Knight objects.
     */
    public void conductTour() {
        //Chessboard object
        Chessboard chess2 = new Chessboard();
        //Knight Object
        Knight knight = new Knight();

        //int used to move knight
        int k = 1;

        //passing k and chess2 to move method of Knight class
        knight.move(k, chess2);

        //while loop to call canMove method of Knight class and see if knight 
        //can move, loop ends when knight can't move
        while (knight.canMove(chess2)) {
            //if canMove = true, knight moves
            knight.move(k, chess2);

            //incrementing k everytime knight moves
            k++;
        }

        //if k > longest tour then longest tour = k
        if (k > longestT) {
            longestT = k - 1; //updates best tour length
            bestBoard = chess2; //updates best board
            tourNumber++; //updates best board number
        }

        //to update to new tour
        chess = chess2;
        
        //storing k to array tours
        tours[k]++;
    }

    /**
     *
     * @return number of best tour
     */
    public int tourNumber() {

        return tourNumber;
    }

    /**
     *
     * @return length of best tour
     */
    public int length() {
        return longestT;
    }

    /**
     *
     * @return best tour
     */
    public String bestTour() {
        return bestBoard.currentBoard();
    }

    /**
     *
     * @return string of tour length and number of tours with that length
     */
    public String tours() {
        String tourS = "";

        for (int i = 0; i < 64; i++) {
            if (tours[i] != 0) {

                tourS += " \n " + "    " + (i + 1) + "                 "
                        + tours[i];

            }

        }

        return tourS;
    }

}
