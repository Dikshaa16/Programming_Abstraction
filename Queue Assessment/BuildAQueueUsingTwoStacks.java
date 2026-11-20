package queue.assessment;

import java.util.*;

public class BuildAQueueUsingTwoStacks {

  private final Deque<Integer> input = new ArrayDeque<>();
  private final Deque<Integer> output = new ArrayDeque<>();

  public void push(int value) {
    input.push(value);
  }

  public int pop() {
    move();
    return output.pop();
  }

  public int peek() {
    move();
    return output.peek();
  }

  public boolean empty() {
    return input.isEmpty() && output.isEmpty();
  }

  private void move() {
    if (output.isEmpty()) while (!input.isEmpty()) output.push(input.pop());
  }

  public static void main(String[] args) {
    System.out.println("Build a Queue Using Two Stacks");
  }
}
