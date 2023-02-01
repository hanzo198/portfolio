/** Roberto Andino
 *  File: Knight.java
 *  Moves knight
 *  Knows 8 type of moves knight can make
 *  uses random to move knight randomly
 *  Determines if move is legal or not
 */
package assignment3;

import java.util.*;

public class Knight {

    private Random rand = new Random(); //to create random number
    private int kCol; // current knight col
    private int kRow; // current knight row
    private ArrayList<Integer> row2; // to make random moves
    private ArrayList<Integer> col2; // to make random moves
    //array rowMoves to store knight horizontal moves
    private static final int[] rowMoves = {-1, -2, -2, -1, 1, 2, 2, 1};
    //array colMoves to store knight vertical moves
    private static final int[] colMoves = {2, 1, -1, -2, -2, -1, 1, 2};

    /**
     * initialize kCol and kRow to 0 initialize row2 and col2 ArrayList
     */
    public Knight() {

        kCol = 0;
        kRow = 0;

        row2 = new ArrayList<Integer>();
        col2 = new ArrayList<Integer>();

    }

    /**
     * moves knight randomly to available location
     *
     * @param knight to move knight
     * @param table to access Chessboard methods
     */
    public void move(int knight, Chessboard table) {

        if (knight != 1) {
            
            //random variable
            int random = rand.nextInt(col2.size());

            table.add(row2.get(random), col2.get(random), knight);

            //to get random 
            kRow = row2.get(random);
            kCol = col2.get(random);

            //to clear arraylist
            row2.clear();
            col2.clear();

        } else {

            table.add(kRow, kCol, knight);

        }

    }

    /**
     * checks if knight moves out of chessboard and if location has not been
     * visited yet
     *
     * @param board to access Chessboard methods
     * @return true is move is legal, or false is move is not legal
     */
    public boolean canMove(Chessboard board) {

        for (int i = 0; i < 8; i++) {
            int c = rowMoves[i] + kRow;
            int z = colMoves[i] + kCol;

            if (c >= 0 && c < 8 && z >= 0 && z < 8) {
                if (board.get(c, z) == 0) {
                    row2.add(c);
                    col2.add(z);
                }
            }

        }

        if (!row2.isEmpty() && !col2.isEmpty()) {
            return true;
        }

        return false;
    }

}
