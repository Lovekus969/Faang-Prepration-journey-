public class Tree {

    // Inner class representing a node in the tree
    class Node {
        String name;        // No 'Public', should be 'public' if needed
        Node[] children;    // Array to hold child nodes

        // Constructor to initialize a node
        Node(String name, Node[] children) {
            this.name = name;
            this.children = children;
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();

        // Example: creating a simple tree
        Node leaf1 = tree.new Node("Leaf1", new Node[0]);
        Node leaf2 = tree.new Node("Leaf2", new Node[0]);
        Node[] children = { leaf1, leaf2 };
        Node root = tree.new Node("Root", children);

        // Print root name
        System.out.println("Root node: " + root.name);
        for (Node child : root.children) {
            System.out.println("Child node: " + child.name);
        }
    }
}
