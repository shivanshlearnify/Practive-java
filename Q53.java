public class Q53 {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        sum(arr);

    }
    public static int sum(int arr[]){
        int sum = 0;
        for(int i =0; i<arr.length; i++){
            sum += arr[i];
        }
       return sum;
    }
}
