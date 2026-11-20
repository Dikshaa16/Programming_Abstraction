package circular.linked.list;

import java.util.*;

public class CircularLinkedListReversePrint {

  public List<Integer> reversePrint(CircularNode head) {
    List<Integer> values = new ArrayList<>();
    if (head == null) return values;
    CircularNode current = head;
    do {
      values.add(current.value);
      current = current.next;
    } while (current != head);
    Collections.reverse(values);
    return values;
  }

  public static class CircularNode {

    int value;
    CircularNode next;

    CircularNode(int value) {
      this.value = value;
    }
  }

  public static void main(String[] args) {
    System.out.println("Circular Linked List Reverse Print");
  }
}
