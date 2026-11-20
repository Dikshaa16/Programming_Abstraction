package tree;

import java.util.*;

public class PostorderTraversalListImplementation {

  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> answer = new ArrayList<>();
    traverse(root, answer);
    return answer;
  }

  private void traverse(TreeNode root, List<Integer> answer) {
    if (root == null) return;
    traverse(root.left, answer);
    traverse(root.right, answer);
    answer.add(root.val);
  }

  public static class TreeNode {

    int val;
    TreeNode left, right;

    TreeNode(int val) {
      this.val = val;
    }
  }

  public static void main(String[] args) {
    System.out.println("Postorder Traversal List Implementation");
  }
}
