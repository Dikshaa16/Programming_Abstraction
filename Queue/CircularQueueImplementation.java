package queue;

import java.util.*;

public class CircularQueueImplementation {

  private final int[] queue;
  private int head, tail, size;

  public CircularQueueImplementation(int capacity) {
    queue = new int[capacity];
  }

  public boolean enQueue(int value) {
    if (size == queue.length) return false;
    queue[tail] = value;
    tail = (tail + 1) % queue.length;
    size++;
    return true;
  }

  public boolean deQueue() {
    if (size == 0) return false;
    head = (head + 1) % queue.length;
    size--;
    return true;
  }

  public int Front() {
    return size == 0 ? -1 : queue[head];
  }

  public int Rear() {
    return size == 0 ? -1 : queue[(tail - 1 + queue.length) % queue.length];
  }

  public static void main(String[] args) {
    System.out.println("Circular Queue Implementation");
  }
}
