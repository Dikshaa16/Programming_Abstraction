package doubly.linked.list;

import java.util.*;

public class DoublyLinkedListTraversal {

  public List<Integer> traverse(DoublyNode head) {
    List<Integer> answer = new ArrayList<>();
    for (DoublyNode n = head; n != null; n = n.next) answer.add(n.value);
    return answer;
  }

  public static class DoublyNode {

    int value;
    DoublyNode prev, next;

    DoublyNode(int value) {
      this.value = value;
    }
  }

  public static void main(String[] args) {
    System.out.println("Doubly Linked List Traversal");
  }
}
