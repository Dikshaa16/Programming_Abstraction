package tree;

import java.util.*;

public class InorderTraversal {

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> answer = new ArrayList<>();
    traverse(root, answer);
    return answer;
  }

  private void traverse(TreeNode root, List<Integer> answer) {
    if (root == null) return;
    traverse(root.left, answer);
    answer.add(root.val);
    traverse(root.right, answer);
  }

  public static class TreeNode {

    int val;
    TreeNode left, right;

    TreeNode(int val) {
      this.val = val;
    }
  }

  public static void main(String[] args) {
    System.out.println("Inorder Traversal");
  }
}
