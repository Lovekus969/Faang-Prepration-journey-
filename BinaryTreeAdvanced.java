import java.util.*;

public class BinaryTreeAdvanced {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // 1. Height of Tree
    public static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // 2. Count Nodes
    public static int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // 3. Find Max Value
    public static int findMax(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(findMax(root.left), findMax(root.right)));
    }

    // 4. Is Balanced Tree
    public static boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    private static int checkHeight(Node root) {
        if (root == null) return 0;
        int left = checkHeight(root.left);
        int right = checkHeight(root.right)
