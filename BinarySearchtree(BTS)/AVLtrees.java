public class AVLtrees {
    static class Node{
        int data, height;
        Node left, right;

        Node(int data){
            this.data = data;
            height = 1;
        }
    }
    public static Node root;

    public static int height(Node root){
        if(root==null)
        return 0;

        return root.height;
    }
    static int max(int a, int b){
        return (a>b) ?  a : b;
    }

    // right rotate subtree rooted with y

    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // perform rotation 
        x.right = y;
    }
    public static Node insert (Node root, int key){
        if(root==null)
        return new Node (key);

        
    }

    public static void main(String args[]){
        
    }
}
