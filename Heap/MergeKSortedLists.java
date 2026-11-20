package heap;

import java.util.*;

public class MergeKSortedLists {

  public ListNode mergeKLists(ListNode[] lists) {
    PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);
    for (ListNode node : lists) if (node != null) heap.offer(node);
    ListNode dummy = new ListNode(0),
      tail = dummy;
    while (!heap.isEmpty()) {
      ListNode node = heap.poll();
      tail.next = node;
      tail = node;
      if (node.next != null) heap.offer(node.next);
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
    System.out.println("Merge K Sorted Lists");
  }
}
