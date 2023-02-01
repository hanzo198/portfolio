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
public class CustomerHashing {
    CustomerNode[] table;
    int arraySize = 29;
    
    CustomerHashing(){
        table = new CustomerNode[arraySize];
    }
    
    //To convert phone number to int. I will be taking last 7 digits
    //because last 4 digits can be more easily repeted in the range
    //of numbers.
    public int getIndex(String keyWord){
        int keyValueInt = 0;
        int index = 0;
        String keyValueString = null;
        
        if (keyWord != null && keyWord.length() >= 7) {  
            keyValueString = keyWord.substring(keyWord.length() - 7);
            keyValueInt = Integer.parseInt(keyValueString);
        }
        index = keyValueInt % arraySize;
        
        return index;
    }
    
    //To insert new customer
    public void insert(Customer newCustomer){
        String keyWordString = newCustomer.phone;
        int index = getIndex(keyWordString);
        
        CustomerNode newNode = new CustomerNode(newCustomer);
        CustomerNode temp = table[index];
        if (temp == null){
            table[index] = newNode;
        }
        else{
            while (table[index] != null) {
                ++index;
                index %= arraySize;
            }
        }
    }
    
    //To find customer
    public String find(String phone){
        String keyWordString = phone;
        String customer;
        int index = getIndex(keyWordString);
        
        if(table[index] != null){
            
            while (table[index] != null) {
                if (table[index].cust.phone.equals(phone)){
                    customer = table[index].cust.toString();
                    return customer;
                }
                ++index;
                index %= arraySize;
            }
        }
        return null;
    }
    
    //To remove customer
    public String remove(String phone){
        String keyWordString = phone;
        int index = getIndex(keyWordString);
        
        if(table[index] != null){
            
            while (table[index] != null) {
                if (table[index].cust.phone.equals(phone)){
                    table[index] = null;
                    return null;
                }
                ++index;
                index %= arraySize;
            }
        }
        return "Not found";
    }
    
    //To display all customers
    public String displayCustomers(){
        String customers = "";
        
        for (int i = 0; i < table.length; i++){
            if (table[i] != null){
                customers += table[i].cust.toString() + "\n\n";
            }
        }
        return customers;
    }
}
