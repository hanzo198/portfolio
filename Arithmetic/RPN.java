/*Jacquelyn Scheck, Roberto Andino, Collin Rijock
 * Group 7
 * COP 3530 RVC 1218
 * Assignment 1
 * 09-19-2021
 * 
 */
package Assignment1;

public class RPN {

    public static void main(String[] args) {

        String s[] = {"5 + ) * ( 2",
            "2 + ( -3 * 5 )",
            "( ( 2 + 3 ) * 5 ) * 8 ",
            "5 * 10 + ( 15 - 20 ) )  - 25",
            "5 + ( 5 *  10 + ( 15 - 20 )  - 25 ) * 9"

        };

        for (int i = 0; i < s.length; i++) {
            arithmetic a = new arithmetic(s[i]);
            if (a.isBalance()) {
                System.out.println(s[i] + " is valid - with respect to parentheses\n");

                System.out.println("The postfix string is " + a.convert2Postfix() + "\n");

                System.out.println("The postfix string evaluates to " + a.evaluateRPN() + "\n");
            } else {
                System.out.println(s[i] + " is invalid - with respect to parentheses\n");
            }

        }

    }

}
