package linked.list;

import java.util.*;

public class RemoveDuplicatesSorted {

  public ListNode deleteDuplicates(ListNode head) {
    ListNode n = head;
    while (n != null && n.next != null) {
      if (n.val == n.next.val) n.next = n.next.next;
      else n = n.next;
    }
    return head;
  }

  public static class ListNode {

    int val;
    ListNode next;
  }

  public static void main(String[] args) {
    System.out.println("Remove Duplicates Sorted");
  }
}
