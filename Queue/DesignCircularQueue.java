package queue;

import java.util.*;

public class DesignCircularQueue {

  private final int[] values;
  private int head, tail, size;

  public void setUp(int k) {} // Use constructor-like API below.

  public DesignCircularQueue(int k) {
    values = new int[k];
  }

  public boolean enQueue(int value) {
    if (isFull()) return false;
    values[tail] = value;
    tail = (tail + 1) % values.length;
    size++;
    return true;
  }

  public boolean deQueue() {
    if (isEmpty()) return false;
    head = (head + 1) % values.length;
    size--;
    return true;
  }

  public int Front() {
    return isEmpty() ? -1 : values[head];
  }

  public int Rear() {
    return isEmpty() ? -1 : values[(tail - 1 + values.length) % values.length];
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean isFull() {
    return size == values.length;
  }

  public static void main(String[] args) {
    System.out.println("Design Circular Queue");
  }
}
