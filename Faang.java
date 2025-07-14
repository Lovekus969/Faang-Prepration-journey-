
public class Faang{
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }

    public static void inorderTraversal(Node root){

        //left root right 
        //base case 
        if(root==null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data +" ");
        inorderTraversal(root.right);
        System.out.println(" inorder function has been done its work cheack out the output ");
    }
    // make function for the preorder and the postorder homework 
    public static void preOrder(Node root){
        //base case 
        if( root==null){
            return;
        }
        System.out.println(" "+root.data);
        preOrder(root.left);
        preOrder(root.right);
        System.out.println(" Preorder function has been successfully worked cheack output ");
    }
    public static void postOrder(Node root) {
                //base case 
                if(root==null){
                    return;
                }
                postOrder(root.left);
                postOrder(root.right);
                System.out.println(" "+root.data);
                System.out.println("Postorder function has been work fully");
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node left = new Node(2);
        Node right= new Node(3);
        // connect the tree 
        root.left = left;
        root.right=right;

        inorderTraversal(root);
        preOrder(root);
        postOrder(root);

    }
}