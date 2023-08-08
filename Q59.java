// Given an array of N integers. Your task is to print the sum of all of the integers.

public class Q59 {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        find(arr);
     }
     public static void find(int arr[]){
         int sum = 0;
         for(int i=0; i<arr.length; i++){
             sum += arr[i];

         }
         System.out.println(sum);
         
     }
}
