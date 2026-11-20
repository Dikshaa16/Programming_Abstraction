package deque;

import java.util.*;

public class ReverseStringUsingDeque {

  public String reverse(String s) {
    Deque<Character> deque = new ArrayDeque<>();
    for (char c : s.toCharArray()) deque.offerLast(c);
    StringBuilder answer = new StringBuilder();
    while (!deque.isEmpty()) answer.append(deque.pollLast());
    return answer.toString();
  }

  public static void main(String[] args) {
    System.out.println("Reverse String Using Deque");
  }
}
