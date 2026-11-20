package circular.linked.list;

import java.util.*;

public class FindMax {

  public int findMax(CircularNode head) {
    if (head == null) return Integer.MIN_VALUE;
    int answer = Integer.MIN_VALUE;
    CircularNode n = head;
    do {
      answer = Math.max(answer, n.value);
      n = n.next;
    } while (n != head);
    return answer;
  }

  public static class CircularNode {

    int value;
    CircularNode next;
  }

  public static void main(String[] args) {
    System.out.println("Find Max");
  }
}
