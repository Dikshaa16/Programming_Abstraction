package linked.list;

import java.util.*;

public class ReorderList {

  public void reorderList(ListNode head) {
    if (head == null) return;
    ListNode slow = head,
      fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    ListNode second = slow.next;
    slow.next = null;
    ListNode previous = null;
    while (second != null) {
      ListNode next = second.next;
      second.next = previous;
      previous = second;
      second = next;
    }
    ListNode first = head;
    while (previous != null) {
      ListNode a = first.next,
        b = previous.next;
      first.next = previous;
      previous.next = a;
      first = a;
      previous = b;
    }
  }

  public static class ListNode {

    int val;
    ListNode next;
  }

  public static void main(String[] args) {
    System.out.println("Reorder List");
  }
}
