package graph;

import java.util.*;

public class MaxAreaOfIsland {

  public int maxAreaOfIsland(int[][] grid) {
    int answer = 0;
    for (int r = 0; r < grid.length; r++) for (
      int c = 0;
      c < grid[0].length;
      c++
    ) if (grid[r][c] == 1) answer = Math.max(answer, area(grid, r, c));
    return answer;
  }

  private int area(int[][] grid, int r, int c) {
    if (
      r < 0 ||
      c < 0 ||
      r >= grid.length ||
      c >= grid[0].length ||
      grid[r][c] != 1
    ) return 0;
    grid[r][c] = 0;
    return (
      1 +
      area(grid, r + 1, c) +
      area(grid, r - 1, c) +
      area(grid, r, c + 1) +
      area(grid, r, c - 1)
    );
  }

  public static void main(String[] args) {
    System.out.println("Max Area of Island");
  }
}
