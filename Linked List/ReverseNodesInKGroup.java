package linked.list;

import java.util.*;

public class ReverseNodesInKGroup {

  public ListNode reverseKGroup(ListNode head, int k) {
    ListNode current = head;
    for (int i = 0; i < k; i++) {
      if (current == null) return head;
      current = current.next;
    }
    ListNode previous = null,
      tail = head;
    for (int i = 0; i < k; i++) {
      ListNode next = tail.next;
      tail.next = previous;
      previous = tail;
      tail = next;
    }
    head.next = reverseKGroup(tail, k);
    return previous;
  }

  public static class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
    }
  }

  public static void main(String[] args) {
    System.out.println("Reverse Nodes in k-Group");
  }
}
