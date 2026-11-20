package tree;

import java.util.*;

public class BinaryTreeValidation {

  public boolean isValidBST(TreeNode root) {
    return validate(root, null, null);
  }

  private boolean validate(TreeNode node, Integer low, Integer high) {
    if (node == null) return true;
    if (
      (low != null && node.val <= low) || (high != null && node.val >= high)
    ) return false;
    return (
      validate(node.left, low, node.val) && validate(node.right, node.val, high)
    );
  }

  public static class TreeNode {

    int val;
    TreeNode left, right;

    TreeNode(int val) {
      this.val = val;
    }
  }

  public static void main(String[] args) {
    System.out.println("Binary Tree Validation");
  }
}
