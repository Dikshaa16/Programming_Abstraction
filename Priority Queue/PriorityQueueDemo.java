package priority.queue;

import java.util.*;

public class PriorityQueueDemo {

  private final PriorityQueue<Integer> heap = new PriorityQueue<>();

  public void offer(int value) {
    heap.offer(value);
  }

  public Integer poll() {
    return heap.poll();
  }

  public Integer peek() {
    return heap.peek();
  }

  public static void main(String[] args) {
    System.out.println("Priority Queue Demo");
  }
}
