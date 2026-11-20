package queue;

import java.util.*;

public class MovingAverageFromDataStream {

  private final Deque<Integer> window = new ArrayDeque<>();
  private final int capacity;
  private long sum;

  public MovingAverageFromDataStream(int size) {
    capacity = size;
  }

  public double next(int value) {
    window.offer(value);
    sum += value;
    if (window.size() > capacity) sum -= window.poll();
    return (double) sum / window.size();
  }

  public static void main(String[] args) {
    System.out.println("Moving Average from Data Stream");
  }
}
