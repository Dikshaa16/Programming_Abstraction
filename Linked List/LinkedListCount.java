package linked.list;

import java.util.*;

public class LinkedListCount {

  public int countNodes(ListNode head) {
    int count = 0;
    for (ListNode n = head; n != null; n = n.next) count++;
    return count;
  }

  public static class ListNode {

    int val;
    ListNode next;
  }

  public static void main(String[] args) {
    System.out.println("Linked List Count");
  }
}
