package doubly.linked.list;

import java.util.*;

public class DeleteAllOccurrences {

  public DoublyNode deleteAll(DoublyNode head, int key) {
    while (head != null && head.value == key) {
      head = head.next;
      if (head != null) head.prev = null;
    }
    for (DoublyNode node = head; node != null; ) {
      DoublyNode next = node.next;
      if (node.value == key) {
        if (node.prev != null) node.prev.next = next;
        if (next != null) next.prev = node.prev;
      }
      node = next;
    }
    return head;
  }

  public static class DoublyNode {

    int value;
    DoublyNode prev, next;

    DoublyNode(int value) {
      this.value = value;
    }
  }

  public static void main(String[] args) {
    System.out.println("Delete All Occurrences");
  }
}
