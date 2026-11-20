package stack;

import java.util.*;

public class SimplifyPath {

  public String simplifyPath(String path) {
    Deque<String> stack = new ArrayDeque<>();
    for (String part : path.split("/")) {
      if (part.equals("..")) {
        if (!stack.isEmpty()) stack.pop();
      } else if (!part.isEmpty() && !part.equals(".")) stack.push(part);
    }
    List<String> parts = new ArrayList<>(stack);
    Collections.reverse(parts);
    return "/" + String.join("/", parts);
  }

  public static void main(String[] args) {
    System.out.println("Simplify Path");
  }
}
