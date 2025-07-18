import java.util.LinkedList;
import java.util.Queue;
public class Traversal {

    // Static inner class for Tree Node
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Inorder Traversal: Left -> Root -> Right
    public void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Preorder Traversal: Root -> Left -> Right
    public void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder Traversal: Left -> Right -> Root
    public void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
   public  void levelOrder(Node root) {
    if (root == null) return;

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        Node current = queue.poll();
        System.out.print(current.data + " ");

        if (current.left != null) queue.add(current.left);
        if (current.right != null) queue.add(current.right);
    }
}

    public static void main(String[] args) {
        Traversal tree = new Traversal();

        /*
                Tree we're building:
                      1
                     / \
                    2   3
                   / \
                  4   5
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Inorder Traversal
        System.out.print("Inorder: ");
        tree.inorder(root);
        System.out.println();

        // Preorder Traversal
        System.out.print("Preorder: ");
        tree.preorder(root);
        System.out.println();

        // Postorder Traversal
        System.out.print("Postorder: ");
        tree.postorder(root);
        System.out.println();

        System.out.println(" level order ");
        tree.levelOrder(root);
        System.out.println();
    }
}
