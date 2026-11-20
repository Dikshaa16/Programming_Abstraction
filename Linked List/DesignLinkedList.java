package linked.list;

import java.util.*;

public class DesignLinkedList {

  private ListNode head;

  public int get(int index) {
    ListNode n = nodeAt(index);
    return n == null ? -1 : n.val;
  }

  public void addAtHead(int val) {
    head = new ListNode(val, head);
  }

  public void addAtTail(int val) {
    if (head == null) {
      head = new ListNode(val, null);
      return;
    }
    ListNode tail = head;
    while (tail.next != null) tail = tail.next;
    tail.next = new ListNode(val, null);
  }

  public void addAtIndex(int index, int val) {
    if (index < 0) return;
    if (index == 0) {
      addAtHead(val);
      return;
    }
    ListNode previous = nodeAt(index - 1);
    if (previous != null) previous.next = new ListNode(val, previous.next);
  }

  public void deleteAtIndex(int index) {
    if (index == 0) {
      if (head != null) head = head.next;
      return;
    }
    ListNode previous = nodeAt(index - 1);
    if (previous != null && previous.next != null) previous.next =
      previous.next.next;
  }

  private ListNode nodeAt(int index) {
    if (index < 0) return null;
    ListNode n = head;
    while (n != null && index-- > 0) n = n.next;
    return n;
  }

  public static class ListNode {

    int val;
    ListNode next;

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public static void main(String[] args) {
    System.out.println("Design Linked List");
  }
}
