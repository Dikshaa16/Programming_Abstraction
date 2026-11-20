package backtracking;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {

  public List<String> letterCombinations(String digits) {
    List<String> answer = new ArrayList<>();
    if (digits.isEmpty()) return answer;
    String[] map = {
      "",
      "",
      "abc",
      "def",
      "ghi",
      "jkl",
      "mno",
      "pqrs",
      "tuv",
      "wxyz",
    };
    backtrack(digits, map, 0, new StringBuilder(), answer);
    return answer;
  }

  private void backtrack(
    String digits,
    String[] map,
    int index,
    StringBuilder current,
    List<String> answer
  ) {
    if (index == digits.length()) {
      answer.add(current.toString());
      return;
    }
    for (char c : map[digits.charAt(index) - '0'].toCharArray()) {
      current.append(c);
      backtrack(digits, map, index + 1, current, answer);
      current.deleteCharAt(current.length() - 1);
    }
  }

  public static void main(String[] args) {
    System.out.println("Letter Combinations of a Phone Number");
  }
}
