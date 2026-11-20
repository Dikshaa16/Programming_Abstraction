package backtracking;

import java.util.*;

public class CombinationSum {

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> answer = new ArrayList<>();
    backtrack(candidates, target, 0, new ArrayList<>(), answer);
    return answer;
  }

  private void backtrack(
    int[] nums,
    int remaining,
    int start,
    List<Integer> current,
    List<List<Integer>> answer
  ) {
    if (remaining == 0) {
      answer.add(new ArrayList<>(current));
      return;
    }
    for (int i = start; i < nums.length; i++) {
      if (nums[i] > remaining) continue;
      current.add(nums[i]);
      backtrack(nums, remaining - nums[i], i, current, answer);
      current.remove(current.size() - 1);
    }
  }

  public static void main(String[] args) {
    System.out.println("Combination Sum");
  }
}
