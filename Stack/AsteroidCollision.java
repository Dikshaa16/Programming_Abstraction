package stack;

import java.util.*;

public class AsteroidCollision {

  public int[] asteroidCollision(int[] asteroids) {
    Deque<Integer> stack = new ArrayDeque<>();
    for (int a : asteroids) {
      boolean destroyed = false;
      while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {
        if (-a > stack.peek()) stack.pop();
        else {
          if (-a == stack.peek()) stack.pop();
          destroyed = true;
          break;
        }
      }
      if (!destroyed) stack.push(a);
    }
    int[] answer = new int[stack.size()];
    for (int i = answer.length - 1; i >= 0; i--) answer[i] = stack.pop();
    return answer;
  }

  public static void main(String[] args) {
    System.out.println("Asteroid Collision");
  }
}
