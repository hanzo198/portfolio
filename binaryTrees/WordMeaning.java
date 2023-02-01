package binaryTrees;

import java.util.LinkedList;

//Object that defines a word and its meaning.
public class WordMeaning {
	
	/*
	 * A word can have more than one meaning. Hence, the 
	 * usage of a linked list as a parameter to store them.
	 */
	public String word;
	public LinkedList<String> meanings;
	
	/*
	 * Constructs a new WordMeaning object
	 * with an already added meaning.
	 * @param w The word
	 * @param m The first meaning to be added to the word.
	 */
	public WordMeaning(String w, String m)
	{ 
		word = w;
		meanings = new LinkedList<>();
		meanings.add(m);
	}
	
	/*
	 * Adds a meaning to the Linked List parameter.
	 * @param newMeaning The meaning to be added to the list
	 */
	public void addMeaning(String newMeaning) {
		if(!meanings.contains(newMeaning)) {
			meanings.add(newMeaning);
		}
	}
	
	/*
	 * Returns the word and all the meanings in an organized manner.
	 * @return The word and its meanings as a String
	 */
	public String toString()
	{
		String value = word + " - " + meanings.get(0);
		String spacer = " ".repeat(word.length());
		for (int i = 1; i < meanings.size(); i++) {
		    value += "\n" + spacer + " - " + meanings.get(i);
		}
		return value;
	}

}
