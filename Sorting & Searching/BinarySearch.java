package sorting.searching;

import java.util.*;

public class BinarySearch {

  public int binarySearch(int[] nums, int target) {
    int low = 0,
      high = nums.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] == target) return mid;
      if (nums[mid] < target) low = mid + 1;
      else high = mid - 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println("Binary Search");
  }
}
