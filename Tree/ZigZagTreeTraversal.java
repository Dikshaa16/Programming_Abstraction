package tree;

import java.util.*;

public class ZigZagTreeTraversal {

  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> answer = new ArrayList<>();
    if (root == null) return answer;
    Deque<TreeNode> queue = new ArrayDeque<>();
    queue.offer(root);
    boolean leftToRight = true;
    while (!queue.isEmpty()) {
      int size = queue.size();
      LinkedList<Integer> level = new LinkedList<>();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        if (leftToRight) level.offerLast(node.val);
        else level.offerFirst(node.val);
        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
      }
      answer.add(level);
      leftToRight = !leftToRight;
    }
    return answer;
  }

  public static class TreeNode {

    int val;
    TreeNode left, right;
  }

  public static void main(String[] args) {
    System.out.println("Zig-Zag Tree Traversal");
  }
}
