package graph;

import java.util.*;

public class SurroundedRegions {

  public void solve(char[][] board) {
    if (board.length == 0) return;
    int rows = board.length,
      cols = board[0].length;
    for (int r = 0; r < rows; r++) {
      mark(board, r, 0);
      mark(board, r, cols - 1);
    }
    for (int c = 0; c < cols; c++) {
      mark(board, 0, c);
      mark(board, rows - 1, c);
    }
    for (int r = 0; r < rows; r++) for (int c = 0; c < cols; c++) board[r][c] =
      board[r][c] == 'S' ? 'O' : 'X';
  }

  private void mark(char[][] board, int r, int c) {
    if (
      r < 0 ||
      c < 0 ||
      r >= board.length ||
      c >= board[0].length ||
      board[r][c] != 'O'
    ) return;
    board[r][c] = 'S';
    mark(board, r + 1, c);
    mark(board, r - 1, c);
    mark(board, r, c + 1);
    mark(board, r, c - 1);
  }

  public static void main(String[] args) {
    System.out.println("Surrounded Regions");
  }
}
