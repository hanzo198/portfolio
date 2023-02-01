/** Roberto Andino
 *  File: Tester.java
 *  Contains the main method to get type of players, players names, and which
 *  player goes first
 *
 *  I affirm that this program is entirely my own work and none of it is the
 *  work of any other person.
 */
package assignment4;

import java.util.Scanner;

public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int choice = 0; //to check if user wants to play again

        do {

            Scanner input = new Scanner(System.in); //to get user input

            int player1; //to get player 1 type 
            int player2; //to get player 2 type
            String player1Name = ""; //to get player 1 name
            String player2Name = ""; //to get player 2 name
            int turn; //to set which player goes first

            Player playerOne = new Human(player1Name); //Player object 1
            Player playerTwo = new Human(player2Name); //Player object 2
            Nim nim = new Nim(); //Nim object

            System.out.println("-----New Game of Nim------\n\n");

            System.out.println("There are 3 type of players: \n"
                    + "1) Human \n"
                    + "2) Smart Computer \n"
                    + "3) Below Average Computer \n");

            System.out.println("Type 1-3 for Player 1: ");
            player1 = input.nextInt();

            System.out.println("Type 1-3 for Player 2: ");
            player2 = input.nextInt();

            input.nextLine(); //clears out input buffer

            System.out.println("What is the name of player 1? ");
            player1Name = input.nextLine();

            System.out.println("What is the name of player 2? ");
            player2Name = input.nextLine();

            System.out.println("Who goes first? \n"
                    + "Type 1 for " + player1Name
                    + "\nType 2 for " + player2Name);
            turn = input.nextInt();

            //if statement to select which type of player player1 is and pass
            //player1name to constructor
            if (player1 == 1) {

                playerOne = new Human(player1Name);

            } else if (player1 == 2) {

                playerOne = new SmartComputer(player1Name);

            } else if (player1 == 3) {

                playerOne = new BelowAvgComputer(player1Name);

            }

            //if statement to select which type of player player2 is and pass 
            //player2name to constructor
            if (player2 == 1) {

                playerTwo = new Human(player2Name);

            } else if (player2 == 2) {

                playerTwo = new SmartComputer(player2Name);

            } else if (player2 == 3) {

                playerTwo = new BelowAvgComputer(player2Name);

            }

            //passing parameters to play method of nim class
            nim.play(playerOne, playerTwo, turn);

            System.out.println("\n Want to run a new game? \n"
                    + "(1) Yes \n(2) No");
            choice = input.nextInt();

        } while (choice == 1);

        System.out.println("----GOODBYE----\n\n");
    }

}
