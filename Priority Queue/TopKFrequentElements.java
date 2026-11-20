package priority.queue;

import java.util.*;

public class TopKFrequentElements {

  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> frequency = new HashMap<>();
    for (int num : nums) frequency.merge(num, 1, Integer::sum);
    PriorityQueue<Integer> heap = new PriorityQueue<>(
      (a, b) -> frequency.get(a) - frequency.get(b)
    );
    for (int num : frequency.keySet()) {
      heap.offer(num);
      if (heap.size() > k) heap.poll();
    }
    int[] answer = new int[k];
    int i = 0;
    while (!heap.isEmpty()) answer[i++] = heap.poll();
    return answer;
  }

  public static void main(String[] args) {
    System.out.println("Top K Frequent Elements");
  }
}
