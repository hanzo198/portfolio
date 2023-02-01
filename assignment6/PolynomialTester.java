/** Roberto Andino
 *  File: PolynomialTester.java
 *  Has the main method, that creates 3 polynomials, passes the term of each 
 *  polynomial to the addterm() method of the polynomial class, and creates a 
 *  new polynomial to create a deep copy of a given polynomial and test it.
 *
 *  I affirm that this program is entirely my own work and none of it is the
 *  work of any other person.
 */
public class PolynomialTester
{
   public static void main(String[] args)
   {
      Polynomial p1 = new Polynomial();
      Polynomial p2 = new Polynomial();
      Polynomial p0 = new Polynomial();
      
      Polynomial nullTest = p1.polyAdd(p2);
      System.out.println("\np1 = " + p1 + ", np2 = " + p2 + "\tp1 + p2 = " + 
                          nullTest);
      nullTest = p1.polyMultiply(p2);
      System.out.println("\np1 = " + p1 + ", np2 = " + p2 + "\tp1 * p2 is " + 
                          nullTest);
      
      p1.addTerm(5, 2);
      p1.addTerm(4, 5);
      p1.addTerm(3, 3);
      p1.addTerm(1, 2);
      p1.addTerm(5, 6);
      p2.addTerm(3, 8);
      p2.addTerm(2, 5);
      p2.addTerm(1, 2);
      p0.addTerm(1, 2);
      p0.addTerm(5, 0);
      p0.addTerm(4, 1);
      
      System.out.println("\np0 = " + p0);
      
      Polynomial p3 = p1.polyAdd(p2);
      System.out.println("\np1 = " + p1 + "\np2 = " + p2 + "\np1+p2 = " + p3);
      
      Polynomial p4 = p1.polyMultiply(p2);
      System.out.println("\np1 = " + p1 + "\np2 = " + p2 + "\np1*p2 = " + p4);
      
      Polynomial p5 = p2.polyMultiply(p2);
      System.out.println("\np2 = " + p2 + "\np2*p2 = " + p5);
      
      Polynomial p6 = p0.polyMultiply(p2);
      System.out.println("\np0 = " + p0 + "\n" + "p2 = " + p2 + "\np0*p2 = " 
                         + p6);
      
      Polynomial p7 = p0.polyAdd(p2);
      System.out.println("\np0 = " + p0 + "\n" + "p2 = " + p2 + "\np0+p2 = " 
                         + p7);
      
      p1 = p1.polyAdd(p2);
      System.out.println("\nAfter p1 = p1+p2  p1 = " + p1);
      
      p2 = p2.polyMultiply(p2);
      System.out.println("\nAfter p2 = p2*p2  p2 = " + p2);
      
      // Testing copy constructor
      Polynomial pCopy = new Polynomial(p1) ;
      System.out.println("\nAfter copy p1 =    " + p1); 
      System.out.println("After copy pCopy = " + pCopy);
      p1.addTerm(10, 4);
      System.out.println("\nAfter adding 10x^4 to p1, p1 = " + p1); 
      System.out.println("But pCopy is still             " + pCopy);
      
      
   }
}
