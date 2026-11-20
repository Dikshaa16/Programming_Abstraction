package backtracking;

import java.util.*;

public class Permutations {

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> answer = new ArrayList<>();
    backtrack(nums, new boolean[nums.length], new ArrayList<>(), answer);
    return answer;
  }

  private void backtrack(
    int[] nums,
    boolean[] used,
    List<Integer> current,
    List<List<Integer>> answer
  ) {
    if (current.size() == nums.length) {
      answer.add(new ArrayList<>(current));
      return;
    }
    for (int i = 0; i < nums.length; i++) if (!used[i]) {
      used[i] = true;
      current.add(nums[i]);
      backtrack(nums, used, current, answer);
      current.remove(current.size() - 1);
      used[i] = false;
    }
  }

  public static void main(String[] args) {
    System.out.println("Permutations");
  }
}
