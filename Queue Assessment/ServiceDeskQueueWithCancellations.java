package queue.assessment;

import java.util.*;

public class ServiceDeskQueueWithCancellations {

  private final Deque<Integer> queue = new ArrayDeque<>();
  private final Set<Integer> cancelled = new HashSet<>();

  public void add(int ticket) {
    queue.offer(ticket);
  }

  public void cancel(int ticket) {
    cancelled.add(ticket);
  }

  public Integer serve() {
    while (!queue.isEmpty()) {
      int ticket = queue.poll();
      if (!cancelled.contains(ticket)) return ticket;
    }
    return null;
  }

  public static void main(String[] args) {
    System.out.println("Service Desk Queue with Cancellations");
  }
}
