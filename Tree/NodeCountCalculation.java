package tree;

import java.util.*;

public class NodeCountCalculation {

  public int countNodes(TreeNode root) {
    if (root == null) return 0;
    return 1 + countNodes(root.left) + countNodes(root.right);
  }

  public static class TreeNode {

    int val;
    TreeNode left, right;

    TreeNode(int val) {
      this.val = val;
    }
  }

  public static void main(String[] args) {
    System.out.println("Node Count Calculation");
  }
}
