package tree;

import java.util.*;

public class HeightOfBinaryTree {

  public int height(TreeNode root) {
    if (root == null) return 0;
    return 1 + Math.max(height(root.left), height(root.right));
  }

  public static class TreeNode {

    TreeNode left, right;
  }

  public static void main(String[] args) {
    System.out.println("Height of Binary Tree");
  }
}
