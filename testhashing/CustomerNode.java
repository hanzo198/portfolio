/**************************************************************
 * This program first test the hash table in console, and then*
 * Java Swing is used for user input to add, view, and delete *
 * content from hash table.                                   *
 *                 Hope you like our program!!!               *
 **************************************************************/
package testhashing;

/**
 *
 * @author Daniel Nunez, William Boscia, and Roberto Andino
 */
public class CustomerNode {
    Customer cust;
    CustomerNode next;
    
    CustomerNode(Customer cust){
        this.cust = cust;
        next = null;
    }
}
