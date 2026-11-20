package deque;

import java.util.*;

public class DequeOperations {

  private final Deque<Integer> deque = new ArrayDeque<>();

  public void pushFront(int value) {
    deque.offerFirst(value);
  }

  public void pushBack(int value) {
    deque.offerLast(value);
  }

  public Integer popFront() {
    return deque.pollFirst();
  }

  public Integer popBack() {
    return deque.pollLast();
  }

  public static void main(String[] args) {
    System.out.println("Deque Operations");
  }
}
