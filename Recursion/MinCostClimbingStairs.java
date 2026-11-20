package recursion;

import java.util.*;

public class MinCostClimbingStairs {

  public int minCostClimbingStairs(int[] cost) {
    int first = 0,
      second = 0;
    for (int i = 2; i <= cost.length; i++) {
      int next = Math.min(second + cost[i - 1], first + cost[i - 2]);
      first = second;
      second = next;
    }
    return second;
  }

  public static void main(String[] args) {
    System.out.println("Min Cost Climbing Stairs");
  }
}
