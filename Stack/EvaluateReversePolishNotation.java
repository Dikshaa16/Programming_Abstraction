package stack;

import java.util.*;

public class EvaluateReversePolishNotation {

  public int evalRPN(String[] tokens) {
    Deque<Integer> stack = new ArrayDeque<>();
    for (String token : tokens) {
      if ("+-*/".contains(token)) {
        int b = stack.pop(),
          a = stack.pop();
        if (token.equals("+")) stack.push(a + b);
        else if (token.equals("-")) stack.push(a - b);
        else if (token.equals("*")) stack.push(a * b);
        else stack.push(a / b);
      } else stack.push(Integer.parseInt(token));
    }
    return stack.pop();
  }

  public static void main(String[] args) {
    System.out.println("Evaluate Reverse Polish Notation");
  }
}
