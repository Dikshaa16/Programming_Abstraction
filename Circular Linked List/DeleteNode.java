package circular.linked.list;

import java.util.*;

public class DeleteNode {

  public CircularNode delete(CircularNode head, int value) {
    if (head == null) return null;
    CircularNode current = head;
    if (head.value == value) {
      if (head.next == head) return null;
      while (current.next != head) current = current.next;
      current.next = head.next;
      return head.next;
    }
    CircularNode previous = head;
    current = head.next;
    while (current != head) {
      if (current.value == value) {
        previous.next = current.next;
        break;
      }
      previous = current;
      current = current.next;
    }
    return head;
  }

  public static class CircularNode {

    int value;
    CircularNode next;

    CircularNode(int value) {
      this.value = value;
    }
  }

  public static void main(String[] args) {
    System.out.println("Delete Node");
  }
}
