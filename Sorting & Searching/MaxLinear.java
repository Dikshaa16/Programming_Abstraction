package sorting.searching;

import java.util.*;

public class MaxLinear {

  public int maxValue(int[] a) {
    int answer = a.length == 0 ? Integer.MIN_VALUE : a[0];
    for (int value : a) answer = Math.max(answer, value);
    return answer;
  }

  public static void main(String[] args) {
    System.out.println("Max Linear");
  }
}
