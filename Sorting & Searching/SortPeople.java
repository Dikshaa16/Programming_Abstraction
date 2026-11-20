package sorting.searching;

import java.util.*;

public class SortPeople {

  public String[] sortPeople(String[] names, int[] heights) {
    Integer[] order = new Integer[names.length];
    for (int i = 0; i < names.length; i++) order[i] = i;
    Arrays.sort(order, (a, b) -> heights[b] - heights[a]);
    String[] answer = new String[names.length];
    for (int i = 0; i < names.length; i++) answer[i] = names[order[i]];
    return answer;
  }

  public static void main(String[] args) {
    System.out.println("Sort People");
  }
}
