/*Talal faraj, Roberto Andino, Saily Hernandez
 * Group 21
 * COP 3530 RVC 1218
 * Assignment 4
 * 12-9-2021
 * 
 */

package assignment4;

public class sorting {
    
  //Method to merge two sub arrays sub1 and sub2 into array
  void merge(int array[], int p, int q, int r) {

    int x1 = q - p + 1;
    int x2 = r - q;

    int sub1[] = new int[x1];
    int sub2[] = new int[x2];

    //filling left and right array
    for (int i = 0; i < x1; i++)
      sub1[i] = array[p + i];
    for (int j = 0; j < x2; j++)
      sub2[j] = array[q + 1 + j];

    //current index
    int i, j, k;
    i = 0;
    j = 0;
    k = p;

    // Until we reach either end of either sub1 or sub2, pick larger among
    // elements in arrays sub1 and sub2 and place them in the correct position 
    //at A[p.. for sorting in descending, use if(L[i] >= <[j])
    while (i < x1 && j < x2) {
      if (sub1[i] <= sub2[j]) {
        array[k] = sub1[i];
        i++;
      } else {
        array[k] = sub2[j];
        j++;
      }
      k++;
    }

    // When we run out of elements in either sub1 or sub2,
    // pick up the remaining elements and put in A[p..r]
    while (i < x1) {
      array[k] = sub1[i];
      i++;
      k++;
    }

    while (j < x2) {
      array[k] = sub2[j];
      j++;
      k++;
    }
  }

  // Method to divide the array into two sub arrays, sort them and merge them
  void mergeSort(int array[], int left, int right) {
    if (left < right) {

      // m is the point where the array is divided into two sub arrays
      int mid = (left + right) / 2;

      // recursive call to sub arrays
      mergeSort(array, left, mid);
      mergeSort(array, mid + 1, right);

      // Mergin sorted sub arrays
      merge(array, left, mid, right);
    }
  }
    
}
