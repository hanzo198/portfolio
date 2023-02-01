/** Roberto Andino
 *  File: TilegameTester.java
 *  Contains the main method to get number of tours that the user wants the
 *  knight to do. Displays best tour, and number of tours of each length
 *  Writes results to a file
 *
 */

package assignment3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TesterMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int tours; //to get number of tours the program has to do
        int counter = 0; //for while loop

        FileWriter fw = null;
        
        try {
            
            File file = new File("OutputFile.txt"); //create file object file
            fw = new FileWriter(file); //FileWrite object fw
            PrintWriter pw = new PrintWriter(fw);//created PrintWriter object pw
            Scanner input = new Scanner(System.in); //to get user input

            System.out.print("----------Knights Tour-----------\n\n");
            System.out.print("Enter number of tours: ");
            tours = input.nextInt();
            System.out.println();

            KnightTour test = new KnightTour();

            do {

                test.conductTour();

                //System.out.println(test.board());
                counter++;

            } while (counter < tours);
            
            //Printing results
            System.out.println("Best tour out of " + tours + " tours\n");
            System.out.print("Tour number: " + test.tourNumber());
            System.out.println("    Lenght: " + test.length() + "\n");
            System.out.println(test.bestTour()+ "\n");
            System.out.println("Tour Length            Number of Tours\n");
            System.out.println("===========            ===============");
            System.out.println(test.tours());
            
            //Writing to file
            pw.print("\nBest tour out of " + tours + " tours\n"); 
            pw.print("\nTour number: " + test.tourNumber());
            pw.print("    Lenght: " + test.length() + "\n\n");
            pw.print(test.bestTour() + "\n");
            pw.print("Tour Length            Number of Tours\n");
            pw.print("===========            ===============\n");
            pw.print(test.tours());
            
            
            pw.close(); //closing file


        } catch (IOException ex) {
            Logger.getLogger(TesterMain.class.getName()).log(Level.SEVERE,
                    null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(TesterMain.class.getName()).log(Level.SEVERE, 
                                 null, ex);
            }
        }

    }

}
