package linked.list;

import java.util.*;

public class InsertionSortList {

  public ListNode insertionSortList(ListNode head) {
    ListNode dummy = new ListNode(0);
    while (head != null) {
      ListNode previous = dummy;
      while (previous.next != null && previous.next.val < head.val)
        previous = previous.next;
      ListNode next = head.next;
      head.next = previous.next;
      previous.next = head;
      head = next;
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
    System.out.println("Insertion Sort List");
  }
}
