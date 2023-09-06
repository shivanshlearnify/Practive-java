// Given an sorted array A of size N. Find number of elements which are less than or equal to given element X.

public class Q61 {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int n=5;
        int x=3;
        int count = find(arr, n, x);
        System.out.println(count);
    }
     public static int find(int arr[], int n, int x){
        int count = 0;
        for(int i=0; i<n; i++){
           if(arr[i]<x || arr[i]==x){
            count++;
           }
        } return count;
     } 
}
