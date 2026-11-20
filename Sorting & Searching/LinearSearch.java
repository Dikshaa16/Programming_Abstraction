package sorting.searching;

import java.util.*;

public class LinearSearch {

  public int linearSearch(int[] a, int target) {
    for (int i = 0; i < a.length; i++) if (a[i] == target) return i;
    return -1;
  }

  public static void main(String[] args) {
    System.out.println("Linear Search");
  }
}
