package queue;

import java.util.*;

public class LastStoneWeight {

  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> heap = new PriorityQueue<>(
      Collections.reverseOrder()
    );
    for (int stone : stones) heap.offer(stone);
    while (heap.size() > 1) {
      int a = heap.poll(),
        b = heap.poll();
      if (a != b) heap.offer(a - b);
    }
    return heap.isEmpty() ? 0 : heap.peek();
  }

  public static void main(String[] args) {
    System.out.println("Last Stone Weight");
  }
}
