package queue;

import java.util.*;

public class ImplementQueueUsingStacks {

  private final Deque<Integer> in = new ArrayDeque<>();
  private final Deque<Integer> out = new ArrayDeque<>();

  public void push(int value) {
    in.push(value);
  }

  public int pop() {
    move();
    return out.pop();
  }

  public int peek() {
    move();
    return out.peek();
  }

  public boolean empty() {
    return in.isEmpty() && out.isEmpty();
  }

  private void move() {
    if (out.isEmpty()) while (!in.isEmpty()) out.push(in.pop());
  }

  public static void main(String[] args) {
    System.out.println("Implement Queue using Stacks");
  }
}
