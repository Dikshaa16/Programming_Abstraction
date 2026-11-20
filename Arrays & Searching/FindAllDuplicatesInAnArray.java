package arrays.searching;

import java.util.*;

public class FindAllDuplicatesInAnArray {

  public List<Integer> findDuplicates(int[] nums) {
    List<Integer> answer = new ArrayList<>();
    for (int value : nums) {
      int index = Math.abs(value) - 1;
      if (nums[index] < 0) answer.add(Math.abs(value));
      else nums[index] = -nums[index];
    }
    return answer;
  }

  public static void main(String[] args) {
    System.out.println("Find All Duplicates in an Array");
  }
}
