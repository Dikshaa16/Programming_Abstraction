package queue;

import java.util.*;

public class FindTheWinnerOfTheCircularGame {

  public int findTheWinner(int n, int k) {
    int winner = 0;
    for (int i = 2; i <= n; i++) winner = (winner + k) % i;
    return winner + 1;
  }

  public static void main(String[] args) {
    System.out.println("Find the Winner of the Circular Game");
  }
}
