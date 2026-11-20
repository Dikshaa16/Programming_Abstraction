package stack;

import java.util.*;

public class StackImplementationUsingArray {

  private int[] values = new int[16];
  private int size;

  public void push(int value) {
    if (size == values.length) values = Arrays.copyOf(values, size * 2);
    values[size++] = value;
  }

  public int pop() {
    if (size == 0) throw new EmptyStackException();
    return values[--size];
  }

  public int peek() {
    if (size == 0) throw new EmptyStackException();
    return values[size - 1];
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public static void main(String[] args) {
    System.out.println("Stack Implementation Using Array");
  }
}
