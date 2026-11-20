package sorting.searching;

import java.util.*;

public class MergeSort {

  public void mergeSort(int[] a) {
    sort(a, 0, a.length - 1);
  }

  private void sort(int[] a, int left, int right) {
    if (left >= right) return;
    int mid = left + (right - left) / 2;
    sort(a, left, mid);
    sort(a, mid + 1, right);
    int[] b = Arrays.copyOfRange(a, left, right + 1);
    int i = 0,
      j = mid - left + 1,
      k = left;
    while (i <= mid - left && j < b.length)
      a[k++] = b[i] <= b[j] ? b[i++] : b[j++];
    while (i <= mid - left) a[k++] = b[i++];
  }

  public static void main(String[] args) {
    System.out.println("Merge Sort");
  }
}
