package stack;

import java.util.*;

public class NextGreaterElementIi {

  public int[] nextGreaterElements(int[] nums) {
    int n = nums.length;
    int[] answer = new int[n];
    Arrays.fill(answer, -1);
    Deque<Integer> stack = new ArrayDeque<>();
    for (int i = 0; i < 2 * n; i++) {
      int value = nums[i % n];
      while (!stack.isEmpty() && nums[stack.peek()] < value)
        answer[stack.pop()] = value;
      if (i < n) stack.push(i);
    }
    return answer;
  }

  public static void main(String[] args) {
    System.out.println("Next Greater Element II");
  }
}
