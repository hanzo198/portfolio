package binaryTrees;

import java.util.LinkedList;

//Binary tree handler class for WordMeaning nodes.
public class WordList {

	//Contains current words in the tree.
	private String words;
	//Contains the words that have been deleted from the tree.
	private LinkedList<String> deletedWords;

	public WordList() {
		words = "";
		deletedWords = new LinkedList<>();
	}

	/*
	 * Adds a WordMeaning node to the tree.
	 * @param node The root of the tree that will contain the node.
	 * @param value The value to be added to the tree.
	 */
	public void insert(WordMeaningNode root, WordMeaning value) {
		/*
		 * If the word comes before the root's value, insert it
		 * to the left subtree.
		 */
		if (value.word.compareTo(root.value.word) < 0) {
			if (root.left != null) {
				insert(root.left, value);
			} else {
				words += root.value.word + " ";
				root.left = new WordMeaningNode(value);
			}
		/*
		 * If the word comes after the root's value, insert it to
		 * the right subtree.
		 */
		} else if (value.word.compareTo(root.value.word) > 0) {
			if (root.right != null) {
				insert(root.right, value);
			} else {
				words += root.value.word + " ";
				root.right = new WordMeaningNode(value);
			}
		/*
		 * If the words are equal, compare their meanings and add
		 * the missing ones to the root's value.
		 */
		} else {
			for(String currentMeaning : value.meanings) {
				if(!root.value.meanings.contains(currentMeaning)) {
					root.value.meanings.add(currentMeaning);
				}
			}
		}
	}

	/*
	 * Displays the tree's values in alphabetical order recursively by
	 * printing [left tree] [root] [right tree]. Stop condition is
	 * root == null.
	 * @param root The root of the tree to be printed.
	 */
	public void inOrder(WordMeaningNode root) // Ascending order
	{
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.value.toString());
			inOrder(root.right);
		}
	}

	/*
	 * Searches a value in the tree recursively.
	 * @param root The root of the tree to be surveyed.
	 * @param key The word to be searched as a String value.
	 * @return True if the value was found, otherwise returns false.
	 */
	public boolean contains(WordMeaningNode root, String key) {
		
		//Stop condition (Got to the lowest level without finding a match)
		if (root == null) {
			return false;
		}

		//String comparison result of key and the value at the current root node.
		int compareResult = key.compareTo(root.value.word);

		/*
		 * Recursively calls contains depending on the value of the comparison.
		 * Lower than 0 surveys the left subtree while the opposite surveys the
		 * right one. If the values are equal, the word was found in the tree
		 * and true is returned.
		 */
		if (compareResult < 0) {
			return contains(root.left, key);
		}
		else if (compareResult > 0) {
			return contains(root.right, key);
		}
		else {
			return true; //Value found
		}
	}
	
	/*
	 * Deletes a node from the tree and updates the words and deletedWords
	 * parameters. It uses the recursive helper method deleteNodeRec.
	 * @param root The root of the tree containing the node to be deleted.
	 * @param key The value to be deleted from the tree as a String.
	 * @return The new root of the tree.
	 */
	public WordMeaningNode deleteNode(WordMeaningNode root, String key) {
		/*
		 * If the word is in the tree, remove it from the words parameter
		 * and add it to the deletedWords list.
		 */
		if(contains(root, key)) {
			deletedWords.add(key);
			words = words.replace(key + " ", "");
		}
		//Delete the node from the tree and return the new root.
		return deleteNodeRec(root, key);
	}

	/*
	 * Recursive helper method for deleteNode.
	 * @param root The root of the tree containing the node to be deleted.
	 * @param key The value to be deleted from the tree as a String.
	 * @return The new root of the tree.
	 */
	private WordMeaningNode deleteNodeRec(WordMeaningNode root, String key) {
		
		//Stop condition in case the subtree is empty.
		if (root == null) {
			return root;
		}
		
		//Comparison result between the root's value and the key parameter.
		int compareResult = key.compareTo(root.value.word);

		/*
		 * If the value comes before or after the root's value, recursively call
		 * deleteNodeRec on the left or right subtree respectively.
		 * If they are equal:
		 * In case the node has two children, replace the current root with the
		 * minimum key on the left subtree by copying over word and meanings. Then
		 * proceed to delete the minimum key obtained with the help of the getMinimumKey
		 * method.
		 * If it has none or one child, replace the root with the left child or the right one
		 * if there is no left. This is done recursively by the priorly called deleteNodeRec obtaining
		 * the returned value.
		 * Finally the new root of the whole tree is returned.
		 */
		if (compareResult < 0) {
			root.left = deleteNodeRec(root.left, key);
		} else if (compareResult > 0) {
			root.right = deleteNodeRec(root.right, key);
		} else if (root.left != null && root.right != null) { //two children
			WordMeaningNode minKey = getMinimumKey(root.right);
			root.value.word = minKey.value.word;
			root.value.meanings = minKey.value.meanings;
			root.right = deleteNodeRec(root.right, root.value.word);
		} else {
			root = (root.left != null) ? root.left : root.right;
		}
		return root;
	}

	// You may need this helper function to find minimum value node in the subtree
	// rooted at `curr`
	public WordMeaningNode getMinimumKey(WordMeaningNode curr) {
		while (curr.left != null) {
			curr = curr.left;
		}
		return curr;
	}

	/*
	 * toString method
	 * @return The words parameter.
	 */
	public String toString() {
		return words;
	}
	
	/*
	 * Getter method for the deletedWords parameter.
	 * @return A linked list containing the deleted
	 * words.
	 */
	public LinkedList<String> getDeletedWords(){
		return deletedWords;
	}
}
