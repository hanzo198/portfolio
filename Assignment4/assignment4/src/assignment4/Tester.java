/*Talal faraj, Roberto Andino, Saily Hernandez
 * Group 21
 * COP 3530 RVC 1218
 * Assignment 4
 * 12-9-2021
 * 
 */

package assignment4;


import java.util.Arrays;

public class Tester {
    
    public static void main(String[] args) {
        
    //unsorted array
    int[] array = { 15, 32, 43, 6, 54, 8 };
  
    System.out.println("Unsorted Array : " + Arrays.toString(array));

    sorting object = new sorting();

    //calling method merge sort
    object.mergeSort(array, 0, array.length - 1);

    System.out.println("Sorted Array : " + Arrays.toString(array));
      
    }
}