/*Jacquelyn Scheck, Roberto Andino, Collin Rijock
 * Group 7
 * COP 3530 RVC 1218
 * Assignment 1
 * 09-19-2021
 * 
 */
import java.util.Stack;
public class Arithmetic {
	String expression;
	public Arithmetic() {
		
	}
	public Arithmetic(String s) {
		this.expression = s;
	}
	public boolean isBalance() {
		Stack<String> stck = new Stack<String>();
		String curr;
		
		for (int i = 0; i < this.expression.length(); ++i) {
			curr = "" + this.expression.charAt(i);
			if (curr.equals("(")) {
				stck.push("(");
			}
			else if (curr.equals(")")) {
				stck.pop();
			}
			
		}
		if (stck.isEmpty()) {
			return true;
		}
		else if (!stck.isEmpty()) {
			return false;
		}
		else {
			return false;
		}
	}

}
