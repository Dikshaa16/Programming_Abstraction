package tree;

import java.util.*;

public class InorderTraversalIterative {

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> answer = new ArrayList<>();
    Deque<TreeNode> stack = new ArrayDeque<>();
    while (root != null || !stack.isEmpty()) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();
      answer.add(root.val);
      root = root.right;
    }
    return answer;
  }

  public static class TreeNode {

    int val;
    TreeNode left, right;
  }

  public static void main(String[] args) {
    System.out.println("Inorder Traversal Iterative");
  }
}
