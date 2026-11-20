package linked.list;

import java.util.*;

public class LinkedListCycleIi {

  public ListNode detectCycle(ListNode head) {
    ListNode slow = head,
      fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) break;
    }
    if (fast == null || fast.next == null) return null;
    slow = head;
    while (slow != fast) {
      slow = slow.next;
      fast = fast.next;
    }
    return slow;
  }

  public static class ListNode {

    int val;
    ListNode next;
  }

  public static void main(String[] args) {
    System.out.println("Linked List Cycle II");
  }
}
