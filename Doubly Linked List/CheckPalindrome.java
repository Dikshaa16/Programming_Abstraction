package doubly.linked.list;

import java.util.*;

public class CheckPalindrome {

  public boolean isPalindrome(DoublyNode head, DoublyNode tail) {
    while (head != tail && head.prev != tail) {
      if (head.value != tail.value) return false;
      head = head.next;
      tail = tail.prev;
    }
    return true;
  }

  public static class DoublyNode {

    int value;
    DoublyNode prev, next;

    DoublyNode(int value) {
      this.value = value;
    }
  }

  public static void main(String[] args) {
    System.out.println("Check Palindrome");
  }
}
