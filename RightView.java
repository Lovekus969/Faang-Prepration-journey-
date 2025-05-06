public class RightView {
  class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

    public static List<Integer> rightView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll();
                if (i == levelSize - 1) result.add(node.val); // last node of each level

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
        }

        return result;
    }
}
