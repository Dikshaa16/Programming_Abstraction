package graph;

import java.util.*;

public class FindIfPathExistsInGraph {

  public boolean validPath(int n, int[][] edges, int start, int end) {
    List<Integer>[] graph = new ArrayList[n];
    for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
    for (int[] edge : edges) {
      graph[edge[0]].add(edge[1]);
      graph[edge[1]].add(edge[0]);
    }
    boolean[] visited = new boolean[n];
    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(start);
    while (!stack.isEmpty()) {
      int node = stack.pop();
      if (node == end) return true;
      if (visited[node]) continue;
      visited[node] = true;
      for (int neighbor : graph[node])
        if (!visited[neighbor]) stack.push(neighbor);
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println("Find if Path Exists in Graph");
  }
}
