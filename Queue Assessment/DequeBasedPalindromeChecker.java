package queue.assessment;

import java.util.*;

public class DequeBasedPalindromeChecker {

  public boolean isPalindrome(String value) {
    Deque<Character> deque = new ArrayDeque<>();
    for (char c : value.toLowerCase().toCharArray())
      if (Character.isLetterOrDigit(c)) deque.offerLast(c);
    while (deque.size() > 1)
      if (deque.pollFirst() != deque.pollLast()) return false;
    return true;
  }

  public static void main(String[] args) {
    System.out.println("Deque-Based Palindrome Checker");
  }
}
