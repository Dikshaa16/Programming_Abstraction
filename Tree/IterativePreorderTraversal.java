package tree;

import java.util.*;

public class IterativePreorderTraversal {

  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> answer = new ArrayList<>();
    Deque<TreeNode> stack = new ArrayDeque<>();
    if (root != null) stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      answer.add(node.val);
      if (node.right != null) stack.push(node.right);
      if (node.left != null) stack.push(node.left);
    }
    return answer;
  }

  public static class TreeNode {

    int val;
    TreeNode left, right;
  }

  public static void main(String[] args) {
    System.out.println("Iterative Preorder Traversal");
  }
}
