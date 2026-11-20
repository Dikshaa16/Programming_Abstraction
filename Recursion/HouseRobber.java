package recursion;

import java.util.*;

public class HouseRobber {

  public int rob(int[] nums) {
    int skip = 0,
      take = 0;
    for (int value : nums) {
      int next = Math.max(skip, take);
      take = skip + value;
      skip = next;
    }
    return Math.max(skip, take);
  }

  public static void main(String[] args) {
    System.out.println("House Robber");
  }
}
