package queue;

import java.util.*;

public class ImplementStackUsingQueues {

  private final Deque<Integer> queue = new ArrayDeque<>();

  public void push(int value) {
    queue.offer(value);
    for (int i = 0; i < queue.size() - 1; i++) queue.offer(queue.poll());
  }

  public int pop() {
    return queue.poll();
  }

  public int top() {
    return queue.peek();
  }

  public boolean empty() {
    return queue.isEmpty();
  }

  public static void main(String[] args) {
    System.out.println("Implement Stack using Queues");
  }
}
