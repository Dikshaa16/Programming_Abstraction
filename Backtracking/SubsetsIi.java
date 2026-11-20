package backtracking;

import java.util.*;

public class SubsetsIi {

  public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> answer = new ArrayList<>();
    backtrack(nums, 0, new ArrayList<>(), answer);
    return answer;
  }

  private void backtrack(
    int[] nums,
    int start,
    List<Integer> current,
    List<List<Integer>> answer
  ) {
    answer.add(new ArrayList<>(current));
    for (int i = start; i < nums.length; i++) {
      if (i > start && nums[i] == nums[i - 1]) continue;
      current.add(nums[i]);
      backtrack(nums, i + 1, current, answer);
      current.remove(current.size() - 1);
    }
  }

  public static void main(String[] args) {
    System.out.println("Subsets II");
  }
}
