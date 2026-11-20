package circular.linked.list;

import java.util.*;

public class CountNodes {

  public int countNodes(CircularNode head) {
    if (head == null) return 0;
    int count = 0;
    CircularNode n = head;
    do {
      count++;
      n = n.next;
    } while (n != head);
    return count;
  }

  public static class CircularNode {

    int value;
    CircularNode next;
  }

  public static void main(String[] args) {
    System.out.println("Count Nodes");
  }
}
