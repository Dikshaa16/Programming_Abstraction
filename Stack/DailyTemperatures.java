package stack;

import java.util.*;

public class DailyTemperatures {

  public int[] dailyTemperatures(int[] temperatures) {
    int[] answer = new int[temperatures.length];
    Deque<Integer> stack = new ArrayDeque<>();
    for (int i = 0; i < temperatures.length; i++) {
      while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
        int index = stack.pop();
        answer[index] = i - index;
      }
      stack.push(i);
    }
    return answer;
  }

  public static void main(String[] args) {
    System.out.println("Daily Temperatures");
  }
}
