package oops.Binarytrees;

public class Diameteroftree {

    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
           this.diam = diam;
           this.ht = ht;
        }
    }

     public static Info diameter(Node root){
             if(root==null){
                return new Info(0,0);
             }     

             Info leftinfo=(diameter(root.left));
             Info rightinfo=(diameter(root.right));

             int diam = Math.max(Math.max(leftinfo.diam,rightinfo.diam),leftinfo.ht+rightinfo.ht+1);
             int ht = Math.max(leftinfo.ht,rightinfo.ht)+1;

             return new Info(diam,ht);
        }

    public static void main(String args[]){
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(2);

         System.out.println(diameter(root).ht);
    }
}
