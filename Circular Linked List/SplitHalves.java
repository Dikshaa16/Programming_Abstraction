package circular.linked.list;

import java.util.*;

public class SplitHalves {

  public CircularNode[] split(CircularNode head) {
    if (head == null) return new CircularNode[] { null, null };
    CircularNode slow = head,
      fast = head;
    while (fast.next != head && fast.next.next != head) {
      fast = fast.next.next;
      slow = slow.next;
    }
    CircularNode second = slow.next;
    slow.next = head;
    CircularNode tail = second;
    while (tail.next != head) tail = tail.next;
    tail.next = second;
    return new CircularNode[] { head, second };
  }

  public static class CircularNode {

    int value;
    CircularNode next;
  }

  public static void main(String[] args) {
    System.out.println("Split Halves");
  }
}
