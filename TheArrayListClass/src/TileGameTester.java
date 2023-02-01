// Roberto Andino
// File: TilegameTester.java
// Contains the main method to print out hand objects and play the game

import java.util.Scanner;
// A test class for the NumberTile Game
public class TileGameTester
{
    
   public static void main(String[] args)
   {
       //Hand Objects
       Hand hand1 = new Hand();
       Hand hand2 = new Hand();
       
       //instance of TileGame Class
       TileGame tilegame = new TileGame(hand1, hand2);
       
       //to get users input
       Scanner input = new Scanner(System.in);
       
       //choice used to check users input
       int choice = 1;
       
       //do while loop to check if user wants to run a new game
       do{
             
           System.out.print("\n\nStarting a new game..... \n");
           
           System.out.print("\n****Player 1 Initial hand****\n" + hand1.toString());
           System.out.print("\n****Player 2 Initial hand****\n" + hand2.toString());
       
           tilegame.play();
           System.out.print(tilegame.getResults());
           
           System.out.print("\n\nStart new game? \n\n"
                            + "Type 2 (yes) or Type any number to exit :");
           choice = input.nextInt();
       
       }while(choice == 2);
       
       System.out.print("\n\n-------GOODBYE------\n\n");
      
       
   }
} 
