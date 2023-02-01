/** Roberto Andino
 *  File: Polynomial.java
 *  A class to create, add, and multiply polynomials, A polynomial is defined
 *  as a sum of terms where each term has variable x, an int coefficient, and
 *  a nonnegative int exponent
 *
 *  I affirm that this program is entirely my own work and none of it is the
 *  work of any other person.
 */

public class Polynomial {

    private Node head;   // points to the first Node of a Polynomial

    /**
     * Default constructor creates a Polynomial with no terms
     */
    public Polynomial() // DO NOT MODIFY THIS CONSTRUCTOR
    {
        head = null;
    }

    /**
     * "Copy" constructor. Creates a "deep copy" of a given Polynomial. I.e. a
     * new Polynomial with identical terms
     *
     * @param p the Polynomial to be copied
     */
    public Polynomial(Polynomial p) {
        Node current = p.head;

        // Check if p.head is not null
        if (current != null) {
            // Set this head as p.head
            this.head = null;

            while (current != null) {
                // Get term, typecast
                Term term = (Term) current.info;

                // Add term to this polynomial
                addTerm(term.getCoe(), term.getExp());

                // Move current to the next node
                current = current.next;
            }
        }

    }

    /**
     * Creates a new Term and Node containing it and inserts it in its proper
     * place in this Polynomial (i.e. in ascending order by exponent)
     *
     * @param coeff the coefficient of the new Term
     * @param expo the exponent of the new Term
     */
    public void addTerm(int coeff, int expo) {

        // Create a new term
        Term newTerm = new Term(coeff, expo);

        // Create new node containing new term
        Node node = new Node(newTerm);

        //if list is empty insert the node as the head node
        if (this.head == null) {

            this.head = node;
            return;

        } else {

            Node current = head;

            // Compare with head, typecast
            Term headTerm = (Term) current.info;

            //if exp is >= the exp of the last term on list, add new node
            //as new last node
            if (headTerm.getExp() >= expo) {
                node.next = current;
                this.head = node;

            } else { //find the first term with greater exp

                // Compare with the rest of the elements
                while (current != null) {
                    // Check if next is not null
                    if (current.next != null) {
                        //typecast to term
                        Term term = (Term) current.next.info;
                        // Check if the next term's exp is > than exp
                        if (term.getExp() >= expo) {
                            node.next = current.next;
                            current.next = node;
                            break; //stop loop
                        }
                    } else {
                        current.next = node;
                        break; //stop loop
                    }

                    // Move current to the next node
                    current = current.next;
                }
            }
        }

    }

    /**
     * Returns a polynomial as a String in this form: x + 3x^2 + 7x^3 + x^5
     *
     * @return the polynomial as a String
     */
    public String toString() {

        String out = ""; //the polynomial in string format
        Node string = head; //start from the first node of the list

        if (head == null) //Check if list is empty
        {
            return "0"; //the polynomial is '0'
        }
        
        collectTerms(); //calling collectTerms() to format terms first by 
                        //by ascending order
        
        //If temp not null, traverse the list
        while (string != null) 
        {

            if (string.next != null) {
                out += string.info + " + "; //append current obj
            } else {
                out += string.info;
            }

            string = string.next;
        }
        return out; //Formated polynomial

    }

    /**
     * collect terms of a Polynomial object. I.e. replace all terms having the 
     * same exponent with a single term which is their sum
     */
    private void collectTerms() {

        //if head is not empty
        if (this.head != null) {
            Node current = this.head;

            while (current != null) {
                //typecasting
                Term currentT = (Term) current.info;

                // Compare with next
                if (current.next != null) {
                    Node nextNode = current.next;
                    Term nextTerm = (Term) nextNode.info;

                    // Compare coe of current and next nodes
                    // While nextNode's exponent is same as current's exponent
                    while ((nextNode != null) && (currentT.getExp() == 
                            nextTerm.getExp())) {
                        // Sum the coefficients and assign it to the current's 
                        //coefficient
                        currentT.coe = currentT.getCoe() + nextTerm.getCoe();
                        nextNode = nextNode.next;
                        if (nextNode != null) {
                            nextTerm = (Term) nextNode.info;
                        }
                    }

                    // Set current's next as the nextNode
                    current.next = nextNode;
                }
                // Move current to the next node
                current = current.next;
            }
        }
    }

    /**
     * Multiply this Polynomial by another Polynomial
     *
     * @param p the other Polynomial
     * @return the product of the two Polynomials
     */
    public Polynomial polyMultiply(Polynomial p) {
        // Create result polynomial as a copy of this
        Polynomial prod = new Polynomial();

        //node objects to object p.head and this.head
        Node node1 = this.head;
        Node node2 = p.head;

        //check if head is not empty
        if ((node1 != null) && (node2 != null)) {
            //while node1 is not empty
            while (node1 != null) {
                // Get terms, typecasting
                Term term1 = (Term) node1.info;
                //while node2 is not empty
                while (node2 != null) {
                    //get terms, typecast
                    Term term2 = (Term) node2.info;

                    // Add a term to temp
                    prod.addTerm(term1.getCoe() * term2.getCoe(), term1.getExp()
                            + term2.getExp());
                    node2 = node2.next;
                }
                //go to next node
                node1 = node1.next;
                //assign head to node
                node2 = p.head;
            }
            //if node1 is not empty and node2 is empty
        } else if ((node1 != null) && (node2 == null)) {
            prod = new Polynomial(this);
            //if node1 is empty and node2 is not empty
        } else if ((node1 == null) && (node2 != null)) {
            prod = new Polynomial(p);
        }

        return prod; //returning result/product

    }

    /**
     * Add this Polynomial and another Polynomial
     *
     * @param p the other Polynomial
     * @return the sum of the two Polynomials
     */
    public Polynomial polyAdd(Polynomial p) {

        // Create result polynomial as a copy of this
        Polynomial sum = new Polynomial(this);

        // Copy
        Node node = p.head;

        //while node not empty add polynomials
        while (node != null) {
            Term term = (Term) node.info;
            sum.addTerm(term.getCoe(), term.getExp());
            node = node.next;
        }

        return sum; //return result

    }

    // Node class definition - DO NOT MODIFY!
    class Node<E extends Term> {

        private E info;     // each node stores an object of the 
        // type-parameter class...
        private Node next;  // ...and a pointer to another node

        // Node Constructor 
        // parameter x is an object of the type-parameter class
        Node(E x) {
            info = x;	// set info portion to parameter passed
            next = null;	// not pointing to another Node yet
        }
    } // end of Node class definition ============================
} // end of Polynomial class definition =========================
