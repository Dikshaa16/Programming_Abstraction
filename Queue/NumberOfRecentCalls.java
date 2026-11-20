package queue;

import java.util.*;

public class NumberOfRecentCalls {

  private final Deque<Integer> requests = new ArrayDeque<>();

  public int ping(int t) {
    requests.addLast(t);
    while (!requests.isEmpty() && requests.peekFirst() < t - 3000)
      requests.removeFirst();
    return requests.size();
  }

  public static void main(String[] args) {
    System.out.println("Number of Recent Calls");
  }
}
