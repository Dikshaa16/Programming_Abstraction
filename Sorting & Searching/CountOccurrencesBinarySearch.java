package sorting.searching;

import java.util.*;

public class CountOccurrencesBinarySearch {

  public int countOccurrences(int[] a, int target) {
    int first = lower(a, target);
    if (first == a.length || a[first] != target) return 0;
    return lower(a, target + 1) - first;
  }

  private int lower(int[] a, int target) {
    int lo = 0,
      hi = a.length;
    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      if (a[mid] < target) lo = mid + 1;
      else hi = mid;
    }
    return lo;
  }

  public static void main(String[] args) {
    System.out.println("Count Occurrences Binary Search");
  }
}
