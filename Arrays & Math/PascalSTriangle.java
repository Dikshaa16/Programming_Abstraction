package arrays.math;

import java.util.*;

public class PascalSTriangle {

  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    for (int r = 0; r < numRows; r++) {
      List<Integer> row = new ArrayList<>();
      for (int c = 0; c <= r; c++) {
        row.add(
          c == 0 || c == r
            ? 1
            : result.get(r - 1).get(c - 1) + result.get(r - 1).get(c)
        );
      }
      result.add(row);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println("Pascal's Triangle");
  }
}
