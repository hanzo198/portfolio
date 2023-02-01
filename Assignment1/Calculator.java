/*COP3530 RVC 1218 Assignmet 1 for Group 18
 *Alisha Bennett, Jamal Bradshaw, Kristen Courtright  
 *The Calculator Class iterates through the array and prints if parenthesis are balanced or not, postfix expression
 *and postfix evaluation. */
public class Calculator 
{
	public static void main(String[] arg)
	{
		String s[] = {"5 + ) * ( 2", 
			"2 + ( -3 * 5 )", 
			"( ( 2 + 3 ) * 5 ) * 8 ",
			"5 * 10 + ( 15 - 20 ) )  - 25",
			"5 + ( 5 *  10 + ( 15 - 20 )  - 25 ) * 9"
				
				
				/*"5 + ) * 4 + ( 2", 
				"10 + 30 * 5", 
				"( 20 + 30 ) * 50 ",
				"( 50 + 100 ) / ( ( 15 - 20 ) * 25 )",
				"( 30 * ( 100 - 4 ) + ( 20 / 20 - 5 ) + 65"*/
		};
		for (int i = 0; i < s.length; i++)
		{
			Arithmetic a = new Arithmetic(s[i]);
			if (a.isBalance())
			{
				System.out.println(s[i] + " is valid - with respect to parentheses\n");
				System.out.println("The postfix string is " +  a.convert2Postfix() + "\n");
				System.out.println("The postfix string evaluates to " + a.evaluateRPN() +"\n");
		}
			else
				System.out.println(s[i] + " is invalid - with respect to parentheses\n");
			
				
		}
	}
}
