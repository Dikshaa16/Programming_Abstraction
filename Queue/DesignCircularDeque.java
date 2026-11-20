package queue;

import java.util.*;

public class DesignCircularDeque {

  private final int[] values;
  private int head, tail, size;

  public DesignCircularDeque(int k) {
    values = new int[k];
    head = 0;
    tail = 0;
  }

  public boolean insertFront(int value) {
    if (isFull()) return false;
    head = (head - 1 + values.length) % values.length;
    values[head] = value;
    size++;
    return true;
  }

  public boolean insertLast(int value) {
    if (isFull()) return false;
    values[tail] = value;
    tail = (tail + 1) % values.length;
    size++;
    return true;
  }

  public boolean deleteFront() {
    if (isEmpty()) return false;
    head = (head + 1) % values.length;
    size--;
    return true;
  }

  public boolean deleteLast() {
    if (isEmpty()) return false;
    tail = (tail - 1 + values.length) % values.length;
    size--;
    return true;
  }

  public int getFront() {
    return isEmpty() ? -1 : values[head];
  }

  public int getRear() {
    return isEmpty() ? -1 : values[(tail - 1 + values.length) % values.length];
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean isFull() {
    return size == values.length;
  }

  public static void main(String[] args) {
    System.out.println("Design Circular Deque");
  }
}
