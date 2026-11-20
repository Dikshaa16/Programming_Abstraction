package queue.assessment;

import java.util.*;

public class PriorityBasedLabAccess {

  private final PriorityQueue<String> labs = new PriorityQueue<>(
    Collections.reverseOrder()
  );

  public void submit(String name) {
    labs.offer(name);
  }

  public String nextStudent() {
    return labs.poll();
  }

  public static void main(String[] args) {
    System.out.println("Priority-Based Lab Access");
  }
}
