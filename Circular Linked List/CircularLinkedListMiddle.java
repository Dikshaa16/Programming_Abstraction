package circular.linked.list;

import java.util.*;

public class CircularLinkedListMiddle {

  public CircularNode findMiddle(CircularNode head) {
    if (head == null) return null;
    CircularNode slow = head,
      fast = head.next;
    while (fast != head && fast.next != head) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public static class CircularNode {

    int value;
    CircularNode next;

    CircularNode(int value) {
      this.value = value;
    }
  }

  public static void main(String[] args) {
    System.out.println("Circular Linked List Middle");
  }
}
