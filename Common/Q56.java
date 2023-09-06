// You are given an array A of size N. You need to print elements of A in alternate order (starting from index 0).

public class Q56 {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        find(arr);
     }
     public static void find(int arr[]){
         
         for(int i=0; i<arr.length; i+=2){
             System.out.print(arr[i]+" ");
         }
         
     }
}
