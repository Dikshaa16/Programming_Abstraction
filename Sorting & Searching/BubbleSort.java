package sorting.searching;

import java.util.*;

public class BubbleSort {

  public void bubbleSort(int[] a) {
    for (int i = 0; i < a.length - 1; i++) for (
      int j = 0;
      j < a.length - i - 1;
      j++
    ) if (a[j] > a[j + 1]) {
      int t = a[j];
      a[j] = a[j + 1];
      a[j + 1] = t;
    }
  }

  public static void main(String[] args) {
    System.out.println("Bubble Sort");
  }
}
