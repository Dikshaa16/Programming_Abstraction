package linked.list;

import java.util.*;

public class ReverseLinkedListIi {

  public ListNode reverseBetween(ListNode head, int left, int right) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode before = dummy;
    for (int i = 1; i < left; i++) before = before.next;
    ListNode current = before.next;
    for (int i = 0; i < right - left; i++) {
      ListNode next = current.next;
      current.next = next.next;
      next.next = before.next;
      before.next = next;
    }
    return dummy.next;
  }

  public static class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
    }
  }

  public static void main(String[] args) {
    System.out.println("Reverse Linked List II");
  }
}
