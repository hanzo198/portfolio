package binaryTrees;

//Node to build a BST of WordMeaning objects.
public class WordMeaningNode {

	/*
	 * A WordMeaning object  to store the value
	 * and two references to children nodes.
	 */
	public WordMeaning value;
	public WordMeaningNode left, right;

	/*
	 * Constructs a WordMeaningNode object with a 
	 * WordMeaning object as value.
	 * @param value The WordMeaning object that will define
	 * the value of the node.
	 */
	public WordMeaningNode(WordMeaning value) 
	{
		this.value = value;
		left = null;
		right = null;
	}
	
}