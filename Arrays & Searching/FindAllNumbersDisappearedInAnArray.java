package arrays.searching;

import java.util.*;

public class FindAllNumbersDisappearedInAnArray {

  public List<Integer> findDisappearedNumbers(int[] nums) {
    for (int value : nums) {
      int index = Math.abs(value) - 1;
      if (nums[index] > 0) nums[index] = -nums[index];
    }
    List<Integer> answer = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) if (nums[i] > 0) answer.add(i + 1);
    return answer;
  }

  public static void main(String[] args) {
    System.out.println("Find All Numbers Disappeared in an Array");
  }
}
