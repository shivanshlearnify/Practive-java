// Given an integer array arr of size n, you need to sum the elements of arr.



public class Q26 {
    public static void main(String args[]){
     int arr[] = {1, 2, 3, 4};
     int n = arr.length;
     int sum = find(arr, n) ;
     System.out.println(sum);
    }
    public static int find (int arr[], int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        return sum;
    }
}
