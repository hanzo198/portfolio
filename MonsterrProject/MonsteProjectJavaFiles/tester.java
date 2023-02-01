/**
 * Roberto Andino
 * Version 1
 * Program is done in Java programming language
 * 
 * This tester.java class has the main method that creates 6 monsters with the 
 * option to create more monsters if the user chooses to, the user can also 
 * update or see the current attributes of any monster. 
 */
package monsterproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class tester {

    public static void main(String[] args) {
        //for user input
        int choice = 0;
        int choice2 = 0;
        int choice3 = 0;
        int monChoice = 0;
        
        //current monster count
        int monsterCount = 5;
        
        //New monster variables
        String Name = "";
        String Height = "";
        String Gender = "";
        String Species = "";
        int Teeth = 0;
        int Age = 0;
     
        //to get user input
        Scanner input = new Scanner(System.in);

        //array list of type monster
        ArrayList<monster> list = new ArrayList<monster>();

        //creating 6 monsters
        list.add(new monster("dracula", "7 feet", "male", "vampire", 46,
                            1320));
        list.add(new monster("frankenstein", "8 feet", "male", "human", 32, 76));
        list.add(new monster("lycan", "6 feet", "male", "werewolf", 66, 300));
        list.add(new monster("Bigfoot", "9 feet", "male", "mythical ape", 44,
                            240));
        list.add(new monster("lochness monster", "130 feet", "female", "Giant eel",
                            170, 1030));
        list.add(new monster("Xenomorph", "6'10 feet", "female", "alien", 60, 20));

        do //do while loop so program loops until user decides to exit
        {
            //Displaying menu
            System.out.print("\n------Welcome To Monster House------\n\n");
            System.out.print("--Main Menu--\n");
            System.out.print("1) Monsters \n2) New Monster \n3) Exit \n"
                            + "Type choice 1-3: ");
            choice = input.nextInt(); //getting user input
            
            //while loop in case user inputs wrong number
            while(choice <= 0 || choice >= 4){    
                System.out.print("OOPS! Must type betwen 1-3: ");
                choice = input.nextInt();
            }
             
            if (choice == 1) //Monsters
            {
                System.out.print("\n--Monsters--\n");
                
                //for loop to display monster names
                for (int count = 0; count <= monsterCount; count++) {
                    System.out.print(count + ") " + list.get(count).getName()
                            + "\n");
                }

                System.out.print("\nWhat would you like to do?\n"
                        + "1) Monster Data \n2) Update monster data "
                        + "\n3) Main menu \ntype choice 1-3: ");
                choice2 = input.nextInt();
                
                //while loop in case user inputs wrong number
                while(choice2 <= 0 || choice2 >= 4){    
                
                    System.out.print("OOPS! Must type betwen 1-3: ");
                    choice2 = input.nextInt();
                }

                if (choice2 == 1) //to display monster data
                {
                    int exit = 0; //for user input
                    
                    //do while to ask user if he/she wants to display another 
                    //monsters data
                    do{
                    
                        System.out.print("Which monster?\n" + "type choice 0-" 
                                         + monsterCount + ": ");
                        monChoice = input.nextInt();
                        
                        //while loop in case user inputs wrong number
                        while(monChoice < 0 || monChoice > monsterCount){    
                        
                            System.out.print("OOPS! Must type betwen 0-" + 
                                            monsterCount + ": ");
                            monChoice = input.nextInt();
                        }

                        System.out.println(list.get(monChoice) + "\n");

                        System.out.print("Would you like to display another "
                                         + "monsters data? \n1) YES \n2) NO "
                                         + "\nType number: ");
                        exit = input.nextInt();   
                        
                        //while loop in case user inputs wrong number
                        while(exit <= 0 || exit >= 3){    
                
                            System.out.print("OOPS! Must type betwen 1-2: ");
                            exit = input.nextInt();
                        }
                        
                    }while (exit != 2);

                } else if (choice2 == 2) //to update monster data
                {
                    //do while loop to loop until user decides to stop updating
                    //monster data
                    do {

                        int trait;
                        String trait2;

                        System.out.print("\nWhich monster? \n Type choice 0-" 
                                        + monsterCount + ":");
                        monChoice = input.nextInt();
                        
                        //while loop in case user inputs wrong number
                        while(monChoice < 0 || monChoice > monsterCount){    
                        
                            System.out.print("OOPS! Must type betwen 0-" + 
                                            monsterCount + ": ");
                            monChoice = input.nextInt();
                        }

                        System.out.print("\nYou chose to update: \n"
                                + list.get(monChoice));

                        System.out.print("\n What trait would you like to update"
                                        + "?\n");
                        System.out.print("1) Name \n"
                                + "2) Height\n"
                                + "3) Gender\n"
                                + "4) Species\n"
                                + "5) TeethCount\n"
                                + "6) Age\n Type 1-6: ");
                        choice3 = input.nextInt();
                        
                        //while loop in case user inputs wrong number
                        while(choice3 <= 0 || choice3 >= 7){    
                
                            System.out.print("OOPS! Must type betwen 1-6: ");
                            choice3 = input.nextInt();
                        }

                        //if else statement to update trait chosen by user
                        if (choice3 == 1) //updating name
                        {
                            System.out.print("What is the monsters new name?\n"
                                    + "Type Name: ");
                            trait2 = input.nextLine();
                            trait2 = input.nextLine(); //second input because 
                                                       //system skips first one

                            list.get(monChoice).setName(trait2);

                        } else if (choice3 == 2) //updating height
                        {
                            System.out.print("What is the monster new height\n"
                                    + "Type Height: ");
                            trait2 = input.nextLine();
                            trait2 = input.nextLine(); //second input because 
                                                       //system skips first one

                            list.get(monChoice).setHeight(trait2);

                        } else if (choice3 == 3) //updating gender
                        {
                            System.out.print("What is the monster new Gender\n"
                                    + "Type Gender: ");
                            trait2 = input.nextLine();
                            trait2 = input.nextLine(); //second input because 
                                                       //system skips first one

                            list.get(monChoice).setGender(trait2);

                        } else if (choice3 == 4) //updating species
                        {
                            System.out.print("What is the monster new Species\n"
                                    + "Type Species: ");
                            trait2 = input.nextLine();
                            trait2 = input.nextLine(); //second input because 
                                                      //system skips first one

                            list.get(monChoice).setSpecies(trait2);

                        } else if (choice3 == 5) //updating teethCount
                        {
                            System.out.print("How many teeth does the monster have"
                                    + " now? \n Type + or - number: ");
                            trait = input.nextInt();

                            list.get(monChoice).teeth(trait);

                        } else if (choice3 == 6) //updating Age
                        {
                            System.out.print("How many birthdays has the monster "
                                    + "had? " + "\n Type number: ");
                            trait = input.nextInt();

                            list.get(monChoice).birthday(trait);

                        }

                        System.out.print("Would you like to update another trait?"
                                + "\n1) YES \n2) NO \n Type 1-2:");
                        choice2 = input.nextInt();
                        
                        //while loop in case user inputs wrong number
                        while(choice2 <= 0 || choice2 >= 3){    
                
                            System.out.print("OOPS! Must type betwen 1-2: ");
                            choice2 = input.nextInt();
                        }
                        

                    } while (choice2 != 2);

                }

            } else if (choice == 2) //Add new Monster
            {
                
                System.out.print("\nWhat is the monster's name: ");
                Name = input.nextLine();
                Name = input.nextLine();
                
                System.out.print("\nWhat is the monster's height: ");
                Height = input.nextLine();
                
                System.out.print("\nWhat is the monster's gender: ");
                Gender = input.nextLine();
                
                System.out.print("\nWhat is the monster's species: ");
                Species = input.nextLine();
                
                System.out.print("\nWhat is the monster's teeth count: ");
                Teeth = input.nextInt();
                
                System.out.print("\nWhat is the monster's age: ");
                Age = input.nextInt();
                
                list.add(new monster(Name, Height, Gender, Species, Teeth, Age));
                
                System.out.print("\n\n---NEW MONSTER CREATED---\n\n");
                monsterCount++;

            }

        } while (choice != 3); //if choice == 3 then program ends

        System.out.print("\n ----GOODBYE---- \n");

    }
    
    //End of program tester class

}
