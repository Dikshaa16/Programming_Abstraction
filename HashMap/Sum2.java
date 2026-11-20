package hashmap;

import java.util.*;

public class Sum2 {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> positions = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int needed = target - nums[i];
      if (positions.containsKey(needed)) return new int[] {
        positions.get(needed),
        i,
      };
      positions.put(nums[i], i);
    }
    return new int[] { -1, -1 };
  }

  public static void main(String[] args) {
    System.out.println("Sum2");
  }
}
