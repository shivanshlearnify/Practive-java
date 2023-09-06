

public class kadens {
    public static void main(String args[]){
        int arr[]= {1,-2,6,-1,3};
        print(arr);
    }

    public static void print(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            if(currSum<0){
                currSum = 0;
            } 
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);
    }
}
