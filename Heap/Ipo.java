package heap;

import java.util.*;

public class Ipo {

  public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
    Integer[] order = new Integer[profits.length];
    for (int i = 0; i < profits.length; i++) order[i] = i;
    Arrays.sort(order, (a, b) -> capital[a] - capital[b]);
    PriorityQueue<Integer> available = new PriorityQueue<>(
      Collections.reverseOrder()
    );
    int index = 0;
    for (int i = 0; i < k; i++) {
      while (index < order.length && capital[order[index]] <= w)
        available.offer(profits[order[index++]]);
      if (available.isEmpty()) break;
      w += available.poll();
    }
    return w;
  }

  public static void main(String[] args) {
    System.out.println("IPO");
  }
}
