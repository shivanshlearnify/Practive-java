public class LargestNum {
    public static int findLargest(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
           max = Math.max(max, i);
        }
        return max;
    }
    public static  void main(String args[]){
        int arr[] = {7,8,9,10,11,59,6};
        System.out.println(findLargest(arr));
    }
}
