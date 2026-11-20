package heap;

import java.util.*;

public class KClosestPointsToOrigin {

  public int[][] kClosest(int[][] points, int k) {
    PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) ->
      Integer.compare(b[0] * b[0] + b[1] * b[1], a[0] * a[0] + a[1] * a[1])
    );
    for (int[] point : points) {
      heap.offer(point);
      if (heap.size() > k) heap.poll();
    }
    int[][] answer = new int[k][2];
    for (int i = 0; i < k; i++) answer[i] = heap.poll();
    return answer;
  }

  public static void main(String[] args) {
    System.out.println("K Closest Points to Origin");
  }
}
