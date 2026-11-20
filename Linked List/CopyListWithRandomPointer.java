package linked.list;

import java.util.*;

public class CopyListWithRandomPointer {

  public Node copyRandomList(Node head) {
    if (head == null) return null;
    Map<Node, Node> copies = new HashMap<>();
    for (Node n = head; n != null; n = n.next) copies.put(n, new Node(n.val));
    for (Node n = head; n != null; n = n.next) {
      Node copy = copies.get(n);
      copy.next = copies.get(n.next);
      copy.random = copies.get(n.random);
    }
    return copies.get(head);
  }

  public static class Node {

    int val;
    Node next, random;

    Node(int val) {
      this.val = val;
    }
  }

  public static void main(String[] args) {
    System.out.println("Copy List With Random Pointer");
  }
}
