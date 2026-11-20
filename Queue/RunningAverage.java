package queue;

import java.util.*;

public class RunningAverage {

  private long sum;
  private int count;

  public void add(int value) {
    sum += value;
    count++;
  }

  public double average() {
    return count == 0 ? 0.0 : (double) sum / count;
  }

  public static void main(String[] args) {
    System.out.println("Running Average");
  }
}
