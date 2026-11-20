package heap;

import java.util.*;

public class TaskScheduler {

  public int leastInterval(char[] tasks, int n) {
    int[] frequency = new int[26];
    for (char task : tasks) frequency[task - 'A']++;
    Arrays.sort(frequency);
    int max = frequency[25];
    int idle = (max - 1) * n;
    for (int i = 24; i >= 0 && frequency[i] > 0; i--) idle -= Math.min(
      max - 1,
      frequency[i]
    );
    return tasks.length + Math.max(0, idle);
  }

  public static void main(String[] args) {
    System.out.println("Task Scheduler");
  }
}
