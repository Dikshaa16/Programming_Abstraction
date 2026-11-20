package backtracking;

import java.util.*;

public class BinaryWatch {

  public List<String> readBinaryWatch(int turnedOn) {
    List<String> answer = new ArrayList<>();
    for (int h = 0; h < 12; h++) for (int m = 0; m < 60; m++) if (
      Integer.bitCount(h) + Integer.bitCount(m) == turnedOn
    ) answer.add(h + ":" + (m < 10 ? "0" : "") + m);
    return answer;
  }

  public static void main(String[] args) {
    System.out.println("Binary Watch");
  }
}
