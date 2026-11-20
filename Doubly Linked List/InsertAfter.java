package doubly.linked.list;

import java.util.*;

public class InsertAfter {

  public DoublyNode insertAfter(DoublyNode head, DoublyNode target, int value) {
    if (target == null) return head;
    DoublyNode node = new DoublyNode(value);
    node.next = target.next;
    node.prev = target;
    target.next = node;
    if (node.next != null) node.next.prev = node;
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
    System.out.println("Insert After");
  }
}
