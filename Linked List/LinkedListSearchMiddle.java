package linked.list;

import java.util.*;

public class LinkedListSearchMiddle {

  public ListNode findMiddle(ListNode head) {
    ListNode slow = head,
      fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public static class ListNode {

    int val;
    ListNode next;
  }

  public static void main(String[] args) {
    System.out.println("Linked List Search Middle");
  }
}
