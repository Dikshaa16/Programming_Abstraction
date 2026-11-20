package stack;

import java.util.*;

public class MinStack {

  private final Deque<Integer> values = new ArrayDeque<>();
  private final Deque<Integer> minimums = new ArrayDeque<>();

  public void push(int value) {
    values.push(value);
    minimums.push(
      minimums.isEmpty() ? value : Math.min(value, minimums.peek())
    );
  }

  public void pop() {
    values.pop();
    minimums.pop();
  }

  public int top() {
    return values.peek();
  }

  public int getMin() {
    return minimums.peek();
  }

  public static void main(String[] args) {
    System.out.println("Min Stack");
  }
}
