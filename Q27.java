// You are given an array A of size N. You need to print elements of A in alternate order (starting from index 0).



public class Q27 {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        find(arr, n);

    }
    public static void find(int arr[], int n){
        for(int i=0; i<n; i+=2){
        
          System.out.println(arr[i]+" ");
        }
    }
}
