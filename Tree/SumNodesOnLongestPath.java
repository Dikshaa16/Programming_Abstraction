package tree;

import java.util.*;

public class SumNodesOnLongestPath {

  private int longest, answer;

  public int longestPathSum(TreeNode root) {
    longest = answer = 0;
    visit(root, 1, 0);
    return answer;
  }

  private void visit(TreeNode node, int depth, int sum) {
    if (node == null) return;
    sum += node.val;
    if (depth > longest) {
      longest = depth;
      answer = sum;
    } else if (depth == longest) answer = Math.max(answer, sum);
    visit(node.left, depth + 1, sum);
    visit(node.right, depth + 1, sum);
  }

  public static class TreeNode {

    int val;
    TreeNode left, right;

    TreeNode(int val) {
      this.val = val;
    }
  }

  public static void main(String[] args) {
    System.out.println("Sum Nodes on Longest Path");
  }
}
