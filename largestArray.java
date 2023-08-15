

public class largestArray {
    public static void main(String args[]){
        int arr[] = {1,2,6,3,5};
        System.out.println(getLargest(arr));
    }

    public static int getLargest(int arr[]){
        int largest = arr[0];

        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
}
