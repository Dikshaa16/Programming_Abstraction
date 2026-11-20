package linked.list;

import java.util.*;

public class SwapNodesInPairs {

  public ListNode swapPairs(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode previous = dummy;
    while (previous.next != null && previous.next.next != null) {
      ListNode first = previous.next,
        second = first.next;
      first.next = second.next;
      second.next = first;
      previous.next = second;
      previous = first;
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
    System.out.println("Swap Nodes in Pairs");
  }
}
