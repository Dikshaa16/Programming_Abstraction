package linked.list;

import java.util.*;

public class LinkedListPrint {

  public List<Integer> printList(ListNode head) {
    List<Integer> answer = new ArrayList<>();
    for (ListNode n = head; n != null; n = n.next) answer.add(n.val);
    return answer;
  }

  public static class ListNode {

    int val;
    ListNode next;
  }

  public static void main(String[] args) {
    System.out.println("Linked List Print");
  }
}
