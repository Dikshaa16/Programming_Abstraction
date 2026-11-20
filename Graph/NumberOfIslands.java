package graph;

import java.util.*;

public class NumberOfIslands {

  public int numIslands(char[][] grid) {
    int count = 0;
    for (int r = 0; r < grid.length; r++) for (
      int c = 0;
      c < grid[0].length;
      c++
    ) if (grid[r][c] == '1') {
      count++;
      erase(grid, r, c);
    }
    return count;
  }

  private void erase(char[][] grid, int r, int c) {
    if (
      r < 0 ||
      c < 0 ||
      r >= grid.length ||
      c >= grid[0].length ||
      grid[r][c] != '1'
    ) return;
    grid[r][c] = '0';
    erase(grid, r + 1, c);
    erase(grid, r - 1, c);
    erase(grid, r, c + 1);
    erase(grid, r, c - 1);
  }

  public static void main(String[] args) {
    System.out.println("Number of Islands");
  }
}
