// Step 1: Define Node class
class Node {
    int data;
    Node left;
    Node right;

    // Constructor
    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

public class TreeTraversal {
    
    // Step 2: Inorder Traversal (Left -> Root -> Right)
    static void inorder(Node root) {
        if (root == null) return;   // base case
        inorder(root.left);         // visit left subtree
        System.out.print(root.data + " ");  // visit root
        inorder(root.right);        // visit right subtree
    }

    // Step 3: Preorder Traversal (Root -> Left -> Right)
    static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Step 4: Postorder Traversal (Left -> Right -> Root)
    static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Step 5: Main method — Build the tree
    public static void main(String[] args) {
        /*
                1
               / \
              2   3
             / \   \
            4   5   6
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        // Step 6: Call traversal functions
        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();

        System.out.print("Preorder Traversal: ");
        preorder(root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        postorder(root);
        System.out.println();
    }
}
