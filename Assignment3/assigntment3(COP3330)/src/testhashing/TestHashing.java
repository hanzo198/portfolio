/**************************************************************
 * This program first test the hash table in console, and then*
 * Java Swing is used for user input to add, view, and delete *
 * content from hash table.                                   *
 *                 Hope you like our program!!!               *
 **************************************************************/
package testhashing;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Daniel Nunez, William Boscia, and Roberto Andino
 */
public class TestHashing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CustomerHashing hash = new CustomerHashing();
        
        //Create customer 1
        System.out.println("Creating first customer...");
        Customer customer1 = new Customer("Pedro", "FLORIDA - USA", "8881234567");
        hash.insert(customer1);
        System.out.println(customer1.toString() + "\n");
        
        //Create customer 2
        System.out.println("Creating second customer...");
        Customer customer2 = new Customer("Elena", "NEW YORK - USA", "8885469876");
        hash.insert(customer2);
        System.out.println(customer2.toString() + "\n");
        
        //Create customer 3
        System.out.println("Creating third customer...");
        Customer customer3 = new Customer("Marcos", "TEXAS - USA", "8880012345");
        hash.insert(customer3);
        System.out.println(customer3.toString() + "\n");
        
        //Create customer 4
        System.out.println("Creating fourth customer...");
        Customer customer4 = new Customer("Marta", "ARIZONA - USA", "8880000123");
        hash.insert(customer4);
        System.out.println(customer4.toString() + "\n");
        
        //Create customer 5
        System.out.println("Creating fith customer...");
        Customer customer5 = new Customer("Carolina", "ALABAMA - USA", "8880000000");
        hash.insert(customer5);
        System.out.println(customer5.toString() + "\n");
        
        //Find Customer 2
        System.out.println("Finding customer with phone 8885469876...");
        if(hash.find("8885469876") != null){
            System.out.println(hash.find("8885469876") + "\n");
        }
        else{
            System.out.println(hash.find("Not found\n"));
        }
        
        //Find Customer 5
        System.out.println("Finding customer with phone 8880000000...");
        if(hash.find("8880000000") != null){
            System.out.println(hash.find("8880000000") + "\n");
        }
        else{
            System.out.println(hash.find("Not found\n"));
        }
        
        //Remove Customer 3
        System.out.println("Removing customer with phone 8880012345...");
        hash.remove("8880012345");
        System.out.println("Customer removed\n");
        
        //Remove Customer 5
        System.out.println("Removing customer with phone 8880000000...");
        hash.remove("8880000000");
        System.out.println("Customer removed\n");
        
 /***************************************************************************
  ***Here, default test in console ends an Java Swing is used for the user***
  ***to keep adding, viewing, and deleting customers.                     ***  
  ***************************************************************************/ 
        
        int menuOption;      //to use for menu selection
        String name;         //to use to hold name
        String address;      //to use to hold address
        String phone;        //to use to hold phone
        boolean cont = true; //to use for do while loop as condition
        JTextArea text;      //to create JTextArea
        JScrollPane pane;    //to create JScrollPane
        
        //To display menu options
        String displayMenuOptions = "1. Add a Customer\n2. Find a Customer "
                + "\n3. Delete a Customer\n4. View all Customers\n5. Quit\n\n"
                + "Enter a Menu Option (1-5  *Any other key will "
                + "exit the program)";
 
        do{
            //To select an option
            menuOption = GetData.getInt(displayMenuOptions); //user input
            
            switch (menuOption) {
                case 1:
                    //To add name for new customer
                    name = GetData.getString("What is the customer's name?");
                    //To add address for new customer
                    address = GetData.getString("What is the address");
                    //To add phone for new customer
                    phone = GetData.getString("What is the phone number? ex. 8881234567");
                    
                    Customer customer = new Customer(name, address, phone);
                    hash.insert(customer);
                    
                    //Message to let the user know that the new customer was added
                    JOptionPane.showMessageDialog(null, "Customer was added.", "Customer Entry", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    phone = GetData.getString("What is the phone number?");
                    if(hash.find(phone) != null){
                        text = new JTextArea(hash.find(phone), 15, 50);
                        pane = new JScrollPane(text);
                        JOptionPane.showMessageDialog(null, pane, "Customer", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Customer not found", "alert", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 3:
                    phone = GetData.getString("What is the phone number?");
                    if(hash.remove(phone) == null){
                        JOptionPane.showMessageDialog(null, "Customer was deleted.", "Customer Entry", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Customer not found", "alert", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 4:
                    text = new JTextArea(hash.displayCustomers(), 15, 50);
                    pane = new JScrollPane(text);
                    JOptionPane.showMessageDialog(null, pane, "Customers", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    //To exit if 5 is selected
                    System.exit(0);
                    break;
                default:
                    cont = false;
                    System.exit(0);
                    break;
            }
        } while (cont);
    }
}
