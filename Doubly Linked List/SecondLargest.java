package doubly.linked.list;

import java.util.*;

public class SecondLargest {

  public Integer secondLargest(DoublyNode head) {
    Integer first = null,
      second = null;
    for (DoublyNode n = head; n != null; n = n.next) {
      if (first == null || n.value > first) {
        second = first;
        first = n.value;
      } else if (
        n.value != first && (second == null || n.value > second)
      ) second = n.value;
    }
    return second;
  }

  public static class DoublyNode {

    int value;
    DoublyNode prev, next;

    DoublyNode(int value) {
      this.value = value;
    }
  }

  public static void main(String[] args) {
    System.out.println("Second Largest");
  }
}
