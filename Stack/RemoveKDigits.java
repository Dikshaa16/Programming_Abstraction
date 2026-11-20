package stack;

import java.util.*;

public class RemoveKDigits {

  public String removeKdigits(String num, int k) {
    Deque<Character> stack = new ArrayDeque<>();
    for (char c : num.toCharArray()) {
      while (k > 0 && !stack.isEmpty() && stack.peek() > c) {
        stack.pop();
        k--;
      }
      stack.push(c);
    }
    while (k-- > 0 && !stack.isEmpty()) stack.pop();
    StringBuilder answer = new StringBuilder();
    while (!stack.isEmpty()) answer.append(stack.removeLast());
    while (answer.length() > 1 && answer.charAt(0) == '0')
      answer.deleteCharAt(0);
    return answer.length() == 0 ? "0" : answer.toString();
  }

  public static void main(String[] args) {
    System.out.println("Remove K Digits");
  }
}
