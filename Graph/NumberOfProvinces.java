package graph;

import java.util.*;

public class NumberOfProvinces {

  public int findCircleNum(int[][] isConnected) {
    int count = 0;
    boolean[] visited = new boolean[isConnected.length];
    for (int i = 0; i < isConnected.length; i++) if (!visited[i]) {
      count++;
      Deque<Integer> stack = new ArrayDeque<>();
      stack.push(i);
      while (!stack.isEmpty()) {
        int city = stack.pop();
        if (visited[city]) continue;
        visited[city] = true;
        for (int j = 0; j < isConnected.length; j++) if (
          isConnected[city][j] == 1 && !visited[j]
        ) stack.push(j);
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println("Number of Provinces");
  }
}
