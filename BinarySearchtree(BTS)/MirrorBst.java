public class MirrorBst {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
     
    public static Node insert(Node root, int val){
        if(root==null){
            root= new Node(val);
            return root;
        }
        if(root.data > val){
            root.left =insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static Node createMirror(Node root){
        if(root==null){
            return null;
        }
        Node leftM = createMirror(root.left);
        Node rightM = createMirror(root.right);

        root.left = rightM;
        root.right = leftM;

        return root;
    }
    

   public static void main(String args[]){
        int values[] = {8,5,10,3,6,11};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();
       
       createMirror(root);
       inOrder(root);
    }
}
