package doubly.linked.list;

import java.util.*;

public class ReverseList {

  public DoublyNode reverse(DoublyNode head) {
    DoublyNode previous = null;
    while (head != null) {
      previous = head;
      DoublyNode next = head.next;
      head.next = head.prev;
      head.prev = next;
      head = next;
    }
    return previous;
  }

  public static class DoublyNode {

    int value;
    DoublyNode prev, next;

    DoublyNode(int value) {
      this.value = value;
    }
  }

  public static void main(String[] args) {
    System.out.println("Reverse List");
  }
}
