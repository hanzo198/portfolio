/** Roberto Andino
 *  File: Chessboard.java
 *  Creates 8*8 chessboard
 *  Initialize chessboard to 0
 *  adds new knight move to chessboard
 *  gets new knight move and check if is legal
 *  return current chessboard as a mutlti-line string
 */
package assignment3;

public class Chessboard {

    private int boardSize = 8; //used to set size of chessboard
    private int[][] chessboard; //2D chessboard array

    /**
     * Initialize 2d array chessboard and set it to 0
     */
    public Chessboard() {
        chessboard = new int[boardSize][boardSize];

        //initialize board
        for (int i = 0; i < boardSize; i++) {

            for (int j = 0; j < boardSize; j++) {
                chessboard[i][j] = 0; //setting array to 0

            }

        }

    }

    /**
     * To make new move
     *
     * @param row used to get row
     * @param col used to get col
     * @param index used to set current row and col to specified index
     */
    public void add(int row, int col, int index) {
        chessboard[row][col] = index; //setting current row and col to specified
        //index
    }

    /**
     * To check if move is legal
     *
     * @param row used to get row
     * @param col used to get col
     * @return location to class Knight to check if move is legal
     */
    public int get(int row, int col) {
        return chessboard[row][col]; //return current location
    }

    /**
     * sets 2d array chessboard to string
     *
     * @return chessboard as a multi-line String
     */
    public String currentBoard() {
        String chess = ""; //creating string chess

        //creating 2d array of type string
        String[][] chessString = new String[boardSize][boardSize];

        //for loop to pass data from 2d array chessboard to 2d array chessString
        for (int i = 0; i < boardSize; i++) {
            for (int y = 0; y < boardSize; y++) {
                //if current chessboard location = 0, set it to *  
                if (chessboard[i][y] == 0) {
                    chessString[i][y] = " * ";

                } else {
                   chessString[i][y] = Integer.toString(chessboard[i][y]) + " ";
                }
            }
        }

        //for loop to pass data from 2d array chessString to string chess
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {

                if (j == 7) {
                    chess += chessString[i][j] + "\n";

                } else {
                    chess += chessString[i][j];

                }
            }
        }

        //returning current board as string
        return chess;
    }
}
