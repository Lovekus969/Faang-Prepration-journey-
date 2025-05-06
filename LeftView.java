import java.util.*;
  class TreeNode {
      int val;
      TreeNode left, right;
      TreeNode(int val) {
          this.val = val;
      }
  }


public class LeftView {
    public static List<Integer> leftView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll();
                if (i == 0) result.add(node.val); // first node of each level

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
        }

        return result;
    }
}
