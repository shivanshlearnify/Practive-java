// Given an array Arr of size N, swap the Kth element from beginning with Kth element from end.


public class Q63 {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = 8;
        int k = 3;
        find(arr, n, k);
        
     }
     public static void find(int arr[], int n, int k){
        
         
            int temp = arr[k-1];
            arr[k-1] = arr[n-k];
            arr[n-k] = temp;
         
         for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
         }
         
     }
}
