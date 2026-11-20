package circular.linked.list;

import java.util.*;

public class JosephusProblem {

  public int josephus(int n, int k) {
    int answer = 0;
    for (int i = 2; i <= n; i++) answer = (answer + k) % i;
    return answer;
  }

  public static void main(String[] args) {
    System.out.println("Josephus Problem");
  }
}
