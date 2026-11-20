package circular.linked.list;

import java.util.*;

public class InsertBeginning {

  public CircularNode insertBeginning(CircularNode head, int value) {
    CircularNode node = new CircularNode(value);
    if (head == null) {
      node.next = node;
      return node;
    }
    CircularNode tail = head;
    while (tail.next != head) tail = tail.next;
    node.next = head;
    tail.next = node;
    return node;
  }

  public static class CircularNode {

    int value;
    CircularNode next;

    CircularNode(int value) {
      this.value = value;
    }
  }

  public static void main(String[] args) {
    System.out.println("Insert Beginning");
  }
}
