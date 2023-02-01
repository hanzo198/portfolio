/**************************************************************
 * This program first test the hash table in console, and then*
 * Java Swing is used for user input to add, view, and delete *
 * content from hash table.                                   *
 *                 Hope you like our program!!!               *
 **************************************************************/
package testhashing;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Nunez, William Boscia, and Roberto Andino
 */
public class GetData {
    static double getDouble(String s) {
        return Double.parseDouble(getString(s));
    }
    
    static int getInt(String s) {
        return Integer.parseInt(getString(s));
    }
    
    static String getString(String s) {
        return JOptionPane.showInputDialog(s);
    }
}
