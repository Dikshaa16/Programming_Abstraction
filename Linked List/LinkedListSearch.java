package linked.list;

import java.util.*;

public class LinkedListSearch {

  public boolean search(ListNode head, int value) {
    for (ListNode n = head; n != null; n = n.next) if (
      n.val == value
    ) return true;
    return false;
  }

  public static class ListNode {

    int val;
    ListNode next;
  }

  public static void main(String[] args) {
    System.out.println("Linked List Search");
  }
}
