package queue;

import java.util.*;

public class RevealCardsInIncreasingOrder {

  public int[] deckRevealedIncreasing(int[] deck) {
    Arrays.sort(deck);
    Deque<Integer> indices = new ArrayDeque<>();
    for (int i = 0; i < deck.length; i++) indices.offer(i);
    int[] answer = new int[deck.length];
    for (int card : deck) {
      answer[indices.poll()] = card;
      if (!indices.isEmpty()) indices.offer(indices.poll());
    }
    return answer;
  }

  public static void main(String[] args) {
    System.out.println("Reveal Cards In Increasing Order");
  }
}
