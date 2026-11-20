package heap;

import java.util.*;

public class KthSmallestElementInASortedMatrix {

  public int kthSmallest(int[][] matrix, int k) {
    PriorityQueue<Integer> heap = new PriorityQueue<>(
      Collections.reverseOrder()
    );
    for (int[] row : matrix)
      for (int value : row) {
        heap.offer(value);
        if (heap.size() > k) heap.poll();
      }
    return heap.peek();
  }

  public static void main(String[] args) {
    System.out.println("Kth Smallest Element in a Sorted Matrix");
  }
}
