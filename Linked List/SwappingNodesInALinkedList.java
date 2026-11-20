package linked.list;

import java.util.*;

public class SwappingNodesInALinkedList {

  public ListNode swapNodes(ListNode head, int k) {
    ListNode left = head;
    for (int i = 1; i < k; i++) left = left.next;
    ListNode fast = left,
      right = head;
    while (fast.next != null) {
      fast = fast.next;
      right = right.next;
    }
    int value = left.val;
    left.val = right.val;
    right.val = value;
    return head;
  }

  public static class ListNode {

    int val;
    ListNode next;
  }

  public static void main(String[] args) {
    System.out.println("Swapping Nodes in a Linked List");
  }
}
