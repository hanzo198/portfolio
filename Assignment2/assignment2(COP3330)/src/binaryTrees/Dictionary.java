package binaryTrees;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

//Test class for the WordList binary tree.
public class Dictionary {

	public static void main(String[] args) {

		//Scanner for user input.
		Scanner userInput = new Scanner(System.in);
		System.out.println("Creating Dictionary...");
		
		//Instantiate a tree and a null node that will store the root of the tree.
		WordList wordTree = new WordList();
		WordMeaningNode root = null;
		
		/* 
		 * Loop that will run for as long as the user doesn't terminate the program.
		 * It allows the the return to the console after performing an action.
		 */
		while (true) {

			/*
			 * If the root of the tree is a null reference, that means the tree is
			 * empty, so a word and its meaning is requested before any action is
			 * performed on the dictionary.
			 */
			if (root == null) {

				System.out.print("The dictionary is empty, please enter a word: ");
				String firstWord = userInput.next();

				// Skip to next line to avoid reading '/n'
				userInput.nextLine();

				System.out.print("Please enter the word's meaning: ");
				String firstMeaning = userInput.nextLine();

				/*
				 * The reference to the root of the tree is then updated to point to
				 * the newly created node.
				 */
				root = new WordMeaningNode(new WordMeaning(firstWord, firstMeaning));
				System.out.println("Word added to the dictionary.");
				System.out.println("Press ENTER to continue.");
				userInput.nextLine();
				
			}

			//Main menu
			System.out.println();
			System.out.println("Please select an option: ");
			System.out.println("1 - Add a word to the dictionary.");
			System.out.println("2 - Remove an obsolete word from the dictionary.");
			System.out.println("3 - Display dictionary and deleted words.");
			System.out.println("4 - Exit");
			System.out.println();
			//Request an option number from the user
			System.out.print("Please enter the option number: ");

			int option = 0; //Initialize the option variable.
			//The loop will run for as long as the option is an invalid integer.
			while (option < 1 || option > 4) {
				/*
				 * Try-catch block to capture InputMismatchExceptions whenever the user
				 * inputs anything that is not an integer.
				 */
				try {
					option = userInput.nextInt();
					// Skip to next line to avoid reading '/n', which causes issues.
					userInput.nextLine();
					if (option < 1 || option > 4) {
						//Notify the user about invalid option number.
						System.out.print("The value of the option must be between 1 and 4, please try again: ");
					}
				} catch (InputMismatchException e) {
					//Notify the user about illegal option type.
					System.out.print("The option value must be a number, please try again: ");
					userInput.nextLine();
				}
			}

			System.out.println();
			
			if (option == 4) {
				
				//Breaks the loop, terminating the program.
				System.out.println("Program Terminated.");
				break;
				
			}

			//Switch statement to handle the option gotten from user input.
			switch (option) {
			
				/*
				 * Adds a word to the dictionary by generating a
				 * new WordMeaning object and inserting it into the tree
				 * of root 'root' using the insert method. If the word is
				 * already in the tree, then the new meaning is added to its
				 * list of meanings.
				 */
				case 1:
					
					System.out.print("Please enter a word: ");
					String word = userInput.next();
					
					// Skip to next line to avoid reading '/n'
					userInput.nextLine();
					
					System.out.print("Please enter the word's meaning: ");
					String meaning = userInput.nextLine();
					
					wordTree.insert(root, new WordMeaning(word, meaning));
					System.out.println("Word added to the dictionary.");
					
					System.out.println("Press ENTER to continue.");
					userInput.nextLine();
					break;
					
				/*
				 * Deletes a word from the dictionary by using the tree's 
				 * deleteNode method. Then updates the root reference to
				 * point to the returned value, which would be the new root 
				 * of the tree. If the word is not in the tree, then the user
				 * is notified, thanks to the use of the contains method.
				 */
				case 2:
					
					System.out.print("Please enter the word to delete: ");
					String wordToDelete = userInput.next();
					
					// Skip to next line to avoid reading '/n'
					userInput.nextLine();
					
					if(wordTree.contains(root, wordToDelete)) {
						root = wordTree.deleteNode(root, wordToDelete);
						System.out.println("The word " + wordToDelete + " was deleted from the dictionary");
					} else {
						System.out.println("The word was not found");
					}
					
					System.out.println("Press ENTER to continue.");
					userInput.nextLine();
					break;
				
				/*
				 * Shows all the words and meanings in the dictionary in alphabetical
				 * order by using the inOrder method from the tree. To display the 
				 * deleted words, the method getDeletedWords is called, which returns a
				 * LinkedList<String> that contains the requested info. If the list is
				 * empty, that means no words have been deleted from the dictionary.
				 */
				case 3:
					
					System.out.println("Displaying dictionary in alphabetical order: ");
					wordTree.inOrder(root);
					
					System.out.println();
					System.out.println("Displaying removed words: ");
					LinkedList<String> deletedWords = wordTree.getDeletedWords();
					if(!deletedWords.isEmpty()) {
						System.out.print(deletedWords.get(0));
						for(int i = 1; i < deletedWords.size(); i++) {
							System.out.print(", " + deletedWords.get(i));
						}
						System.out.print(".");
						System.out.println();
					} else {
						System.out.println("No words have been removed.");
					}
					
					System.out.println();
					System.out.println("Press ENTER to continue.");
					userInput.nextLine();
					break;
					
				default:
					break;
					
			}
			
		}
		
		//Closes the scanner object.
		userInput.close();
		
	}
}
