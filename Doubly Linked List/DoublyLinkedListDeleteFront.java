package doubly.linked.list;

import java.util.*;

public class DoublyLinkedListDeleteFront {

  public DoublyNode deleteFront(DoublyNode head) {
    if (head == null) {
      return null;
    }

    DoublyNode newHead = head.next;
    head.next = null;

    if (newHead != null) {
      newHead.previous = null;
    }

    return newHead;
  }

  public static class DoublyNode {

    int value;
    DoublyNode previous;
    DoublyNode next;

    DoublyNode(int value) {
      this.value = value;
    }
  }

  public static void main(String[] args) {
    DoublyNode first = new DoublyNode(10);
    DoublyNode second = new DoublyNode(20);
    first.next = second;
    second.previous = first;

    DoublyLinkedListDeleteFront solution = new DoublyLinkedListDeleteFront();
    DoublyNode newHead = solution.deleteFront(first);

    System.out.println(newHead.value);
  }
}
