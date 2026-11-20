package queue;

import java.util.*;

public class Dota2Senate {

  public String predictPartyVictory(String senate) {
    Deque<Integer> radiant = new ArrayDeque<>(),
      dire = new ArrayDeque<>();
    for (int i = 0; i < senate.length(); i++) if (
      senate.charAt(i) == 'R'
    ) radiant.offer(i);
    else dire.offer(i);
    int round = senate.length();
    while (!radiant.isEmpty() && !dire.isEmpty()) {
      int r = radiant.poll(),
        d = dire.poll();
      if (r < d) radiant.offer(r + round);
      else dire.offer(d + round);
    }
    return radiant.isEmpty() ? "Dire" : "Radiant";
  }

  public static void main(String[] args) {
    System.out.println("Dota2 Senate");
  }
}
