package queue.assessment;

import java.util.*;

public class CircularBufferRotation {

  public void rotate(int[] values, int k) {
    k %= values.length;
    reverse(values, 0, values.length - 1);
    reverse(values, 0, k - 1);
    reverse(values, k, values.length - 1);
  }

  private void reverse(int[] values, int left, int right) {
    while (left < right) {
      int t = values[left];
      values[left++] = values[right];
      values[right--] = t;
    }
  }

  public static void main(String[] args) {
    System.out.println("Circular Buffer Rotation");
  }
}
