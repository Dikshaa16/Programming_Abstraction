package backtracking;

import java.util.*;

public class CombinationSumIi {

  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
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
      if (i > start && nums[i] == nums[i - 1]) continue;
      if (nums[i] > remaining) break;
      current.add(nums[i]);
      backtrack(nums, remaining - nums[i], i + 1, current, answer);
      current.remove(current.size() - 1);
    }
  }

  public static void main(String[] args) {
    System.out.println("Combination Sum II");
  }
}
