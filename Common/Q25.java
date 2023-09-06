// Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).

// Note: There can be more than one element in the array which have the same value as its index. You need to include every such element's index. Follows 1-based indexing of the array.

import java.util.ArrayList;

public class Q25 {
    public static void main(String args[]){
        int[] arr = {15,2,45,12,7};
        int n = arr.length;
        ArrayList<Integer> result = value(arr, n);

        for (Integer num : result){
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> value(int arr[], int n){
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            if(arr[i]==i+1){
               result.add(i+1);
            }
          
        }
        return result;
    }
    
}
