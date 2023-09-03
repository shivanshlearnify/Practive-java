public class Q97 {
    public static void main(String args[]){
        int arr [] = {1,2,39,6,5,7};
        System.out.println(largestNum(arr));

    }

     public static int largestNum (int arr[]){
        int large = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(large>arr[i]){
                large = arr[i];
            }
        }
        return large;
     }
}
