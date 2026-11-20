package tree;

import java.util.*;

public class CompleteBinaryTreeVerification {

  public boolean isCompleteTree(TreeNode root) {
    if (root == null) return true;
    Deque<TreeNode> queue = new ArrayDeque<>();
    queue.offer(root);
    boolean emptySeen = false;
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node == null) emptySeen = true;
      else {
        if (emptySeen) return false;
        queue.offer(node.left);
        queue.offer(node.right);
      }
    }
    return true;
  }

  public static class TreeNode {

    TreeNode left, right;
  }

  public static void main(String[] args) {
    System.out.println("Complete Binary Tree Verification");
  }
}
