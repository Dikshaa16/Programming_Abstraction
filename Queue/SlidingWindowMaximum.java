package queue;

import java.util.*;

public class SlidingWindowMaximum {

  public int[] maxSlidingWindow(int[] nums, int k) {
    if (nums.length == 0) return new int[0];
    int[] answer = new int[nums.length - k + 1];
    Deque<Integer> deque = new ArrayDeque<>();
    for (int i = 0; i < nums.length; i++) {
      while (!deque.isEmpty() && deque.peekFirst() <= i - k)
        deque.removeFirst();
      while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i])
        deque.removeLast();
      deque.addLast(i);
      if (i >= k - 1) answer[i - k + 1] = nums[deque.peekFirst()];
    }
    return answer;
  }

  public static void main(String[] args) {
    System.out.println("Sliding Window Maximum");
  }
}
