package linked.list;

import java.util.*;

public class PartitionList {

  public ListNode partition(ListNode head, int x) {
    ListNode low = new ListNode(0),
      high = new ListNode(0),
      a = low,
      b = high;
    while (head != null) {
      if (head.val < x) {
        a.next = head;
        a = a.next;
      } else {
        b.next = head;
        b = b.next;
      }
      head = head.next;
    }
    b.next = null;
    a.next = high.next;
    return low.next;
  }

  public static class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
    }
  }

  public static void main(String[] args) {
    System.out.println("Partition List");
  }
}
