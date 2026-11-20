package graph;

import java.util.*;

public class FloodFill {

  public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    int original = image[sr][sc];
    if (original == color) return image;
    fill(image, sr, sc, original, color);
    return image;
  }

  private void fill(int[][] image, int r, int c, int original, int color) {
    if (
      r < 0 ||
      c < 0 ||
      r >= image.length ||
      c >= image[0].length ||
      image[r][c] != original
    ) return;
    image[r][c] = color;
    fill(image, r + 1, c, original, color);
    fill(image, r - 1, c, original, color);
    fill(image, r, c + 1, original, color);
    fill(image, r, c - 1, original, color);
  }

  public static void main(String[] args) {
    System.out.println("Flood Fill");
  }
}
