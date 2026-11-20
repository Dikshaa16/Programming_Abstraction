package sorting.searching;

import java.util.*;

public class SelectionSort {

  public void selectionSort(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < a.length; j++) if (a[j] < a[min]) min = j;
      int t = a[i];
      a[i] = a[min];
      a[min] = t;
    }
  }

  public static void main(String[] args) {
    System.out.println("Selection Sort");
  }
}
