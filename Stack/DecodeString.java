package stack;

import java.util.*;

public class DecodeString {

  public String decodeString(String s) {
    Deque<Integer> counts = new ArrayDeque<>();
    Deque<StringBuilder> strings = new ArrayDeque<>();
    StringBuilder current = new StringBuilder();
    int count = 0;
    for (char c : s.toCharArray()) {
      if (Character.isDigit(c)) count = count * 10 + c - '0';
      else if (c == '[') {
        counts.push(count);
        strings.push(current);
        count = 0;
        current = new StringBuilder();
      } else if (c == ']') {
        StringBuilder previous = strings.pop();
        int repeat = counts.pop();
        for (int i = 0; i < repeat; i++) previous.append(current);
        current = previous;
      } else current.append(c);
    }
    return current.toString();
  }

  public static void main(String[] args) {
    System.out.println("Decode String");
  }
}
