package stack;

import java.util.*;

public class OnlineStockSpan {

  private final Deque<int[]> span = new ArrayDeque<>();

  public int next(int price) {
    int answer = 1;
    while (!span.isEmpty() && span.peek()[0] <= price) answer += span.pop()[1];
    span.push(new int[] { price, answer });
    return answer;
  }

  public static void main(String[] args) {
    System.out.println("Online Stock Span");
  }
}
