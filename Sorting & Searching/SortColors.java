package sorting.searching;

import java.util.*;

public class SortColors {

  public void sortColors(int[] nums) {
    int low = 0,
      mid = 0,
      high = nums.length - 1;
    while (mid <= high) {
      if (nums[mid] == 0) {
        int t = nums[low];
        nums[low++] = nums[mid];
        nums[mid++] = t;
      } else if (nums[mid] == 2) {
        int t = nums[mid];
        nums[mid] = nums[high];
        nums[high--] = t;
      } else mid++;
    }
  }

  public static void main(String[] args) {
    System.out.println("Sort Colors");
  }
}
