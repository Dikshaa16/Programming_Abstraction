package deque;

import java.util.*;

public class PalindromeStringUsingDeque {

  public boolean isPalindrome(String s) {
    Deque<Character> deque = new ArrayDeque<>();
    for (char c : s.toLowerCase().toCharArray())
      if (Character.isLetterOrDigit(c)) deque.offerLast(c);
    while (deque.size() > 1)
      if (deque.pollFirst() != deque.pollLast()) return false;
    return true;
  }

  public static void main(String[] args) {
    System.out.println("Palindrome String Using Deque");
  }
}
