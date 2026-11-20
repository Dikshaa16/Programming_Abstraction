package circular.linked.list;

import java.util.*;

public class SearchElement {

  public boolean search(CircularNode head, int value) {
    if (head == null) return false;
    CircularNode n = head;
    do {
      if (n.value == value) return true;
      n = n.next;
    } while (n != head);
    return false;
  }

  public static class CircularNode {

    int value;
    CircularNode next;
  }

  public static void main(String[] args) {
    System.out.println("Search Element");
  }
}
