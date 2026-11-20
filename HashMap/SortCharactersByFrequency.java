package hashmap;

import java.util.*;

public class SortCharactersByFrequency {

  public String frequencySort(String s) {
    Map<Character, Integer> frequency = new HashMap<>();
    for (char c : s.toCharArray()) frequency.merge(c, 1, Integer::sum);
    List<Character> chars = new ArrayList<>(frequency.keySet());
    chars.sort((a, b) -> frequency.get(b) - frequency.get(a));
    StringBuilder answer = new StringBuilder();
    for (char c : chars)
      for (int i = 0; i < frequency.get(c); i++) answer.append(c);
    return answer.toString();
  }

  public static void main(String[] args) {
    System.out.println("Sort Characters by Frequency");
  }
}
