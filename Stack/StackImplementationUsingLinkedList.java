package stack;

import java.util.*;

public class StackImplementationUsingLinkedList {

  private Node top;

  public void push(int value) {
    top = new Node(value, top);
  }

  public int pop() {
    if (top == null) throw new EmptyStackException();
    int value = top.value;
    top = top.next;
    return value;
  }

  public int peek() {
    if (top == null) throw new EmptyStackException();
    return top.value;
  }

  public boolean isEmpty() {
    return top == null;
  }

  private static class Node {

    int value;
    Node next;

    Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }

  public static void main(String[] args) {
    System.out.println("Stack Implementation Using Linked List");
  }
}
