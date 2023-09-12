public class MinDistanceBtw2NOdes {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node lca2(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if (leftLca == null){
            return rightLca;
        }
        if(rightLca == null){
            return leftLca;
        }

        return root;
    }

    public static int lcaDis(Node root, int n){
        if(root==null){
            return -1;
        }

        if(root.data==n){
            return 0;
        }
        int leftDis = lcaDis(root.left, n);
        int rightDis = lcaDis(root.right, n);

        if(leftDis == -1 && rightDis == -1){
            return -1;
        } else if (leftDis == -1){
            return rightDis+1;
        } else {
           return leftDis+1;
        }

    }

    public static int minDis(Node root, int n1, int n2){
        Node lca = lca2(root, n1, n2);
        int dis1 = lcaDis(lca, n1);
        int dis2 = lcaDis(lca, n2);

        return dis1+dis2;
    }
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 7;
        int n2 = 6;
        System.out.println(minDis(root, n1, n2));
        
    }
}
