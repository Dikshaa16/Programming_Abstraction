package linked.list;

import java.util.*;

public class LinkedListCycle {

  public boolean hasCycle(ListNode head) {
    ListNode slow = head,
      fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) return true;
    }
    return false;
  }

  public static class ListNode {

    int val;
    ListNode next;
  }

  public static void main(String[] args) {
    System.out.println("Linked List Cycle");
  }
}
