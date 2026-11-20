package queue;

import java.util.*;

public class TimeNeededToBuyTickets {

  public int timeRequiredToBuy(int[] tickets, int k) {
    int answer = 0;
    for (int i = 0; i < tickets.length; i++) {
      if (i <= k) answer += Math.min(tickets[i], tickets[k]);
      else answer += Math.min(tickets[i], tickets[k] - 1);
    }
    return answer;
  }

  public static void main(String[] args) {
    System.out.println("Time Needed to Buy Tickets");
  }
}
