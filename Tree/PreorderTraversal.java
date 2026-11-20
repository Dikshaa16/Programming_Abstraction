package tree;

import java.util.*;

public class PreorderTraversal {

  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> answer = new ArrayList<>();
    traverse(root, answer);
    return answer;
  }

  private void traverse(TreeNode root, List<Integer> answer) {
    if (root == null) return;
    answer.add(root.val);
    traverse(root.left, answer);
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
    System.out.println("Preorder Traversal");
  }
}
