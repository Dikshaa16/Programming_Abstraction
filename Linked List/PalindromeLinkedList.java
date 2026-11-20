package linked.list;

import java.util.*;

public class PalindromeLinkedList {

  public boolean isPalindrome(ListNode head) {
    ListNode slow = head,
      fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    ListNode previous = null;
    while (slow != null) {
      ListNode next = slow.next;
      slow.next = previous;
      previous = slow;
      slow = next;
    }
    while (previous != null) {
      if (head.val != previous.val) return false;
      head = head.next;
      previous = previous.next;
    }
    return true;
  }

  public static class ListNode {

    int val;
    ListNode next;
  }

  public static void main(String[] args) {
    System.out.println("Palindrome Linked List");
  }
}
