package tree;

import java.util.*;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

  private int preorderIndex;
  private Map<Integer, Integer> positions = new HashMap<>();

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    for (int i = 0; i < inorder.length; i++) positions.put(inorder[i], i);
    return build(preorder, 0, inorder.length - 1);
  }

  private TreeNode build(int[] preorder, int left, int right) {
    if (left > right) return null;
    TreeNode root = new TreeNode(preorder[preorderIndex++]);
    int middle = positions.get(root.val);
    root.left = build(preorder, left, middle - 1);
    root.right = build(preorder, middle + 1, right);
    return root;
  }

  public static class TreeNode {

    int val;
    TreeNode left, right;

    TreeNode(int val) {
      this.val = val;
    }
  }

  public static void main(String[] args) {
    System.out.println(
      "Construct Binary Tree from Preorder and Inorder Traversal"
    );
  }
}
