package graph;

import java.util.*;

public class KeysAndRooms {

  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    boolean[] visited = new boolean[rooms.size()];
    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(0);
    int visitedCount = 0;
    while (!stack.isEmpty()) {
      int room = stack.pop();
      if (visited[room]) continue;
      visited[room] = true;
      visitedCount++;
      for (int key : rooms.get(room)) stack.push(key);
    }
    return visitedCount == rooms.size();
  }

  public static void main(String[] args) {
    System.out.println("Keys and Rooms");
  }
}
