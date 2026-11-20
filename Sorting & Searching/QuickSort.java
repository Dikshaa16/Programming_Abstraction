package sorting.searching;

import java.util.*;

public class QuickSort {

  public void quickSort(int[] a) {
    quickSort(a, 0, a.length - 1);
  }

  private void quickSort(int[] a, int low, int high) {
    if (low >= high) return;
    int pivot = a[low + (high - low) / 2],
      i = low,
      j = high;
    while (i <= j) {
      while (a[i] < pivot) i++;
      while (a[j] > pivot) j--;
      if (i <= j) {
        int t = a[i];
        a[i++] = a[j];
        a[j--] = t;
      }
    }
    quickSort(a, low, j);
    quickSort(a, i, high);
  }

  public static void main(String[] args) {
    System.out.println("Quick Sort");
  }
}
