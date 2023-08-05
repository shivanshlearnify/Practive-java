// Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).

// Note: There can be more than one element in the array which have the same value as its index. You need to include every such element's index. Follows 1-based indexing of the array.

public class Q54 {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        find(arr);
    }    
    public static void find(int arr[]){
        for(int i=1; i<arr.length; i++){
            if(arr[i]==i+1){
               System.out.println("arr ["+ i + "] = " + i  );
            }
        }
    }
}
