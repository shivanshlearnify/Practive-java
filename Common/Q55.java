// Sum of array

public class Q55 {
    public static void main(String args[]){
       int arr[] = {1,2,3,4,5};
       int sum =find(arr);
       System.out.println(sum);
    }
    public static int find(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
