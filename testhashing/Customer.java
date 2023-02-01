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
public class Customer {
    String name, address, phone;
    
    Customer(String name, String address,String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    
    @Override
     public String toString() {
         return "Name: " + name + "\nAddress: " + address +"\nPhone : " + phone;
        }
}
