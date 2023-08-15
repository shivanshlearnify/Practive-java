

public class PrintSubArray {
     public static void main(String args[]){
        int arr[] = {2,4,6,8};
        printArray(arr);

     }  
     
     //brute force
     public static void printArray(int arr[]){
        int max_Sum = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                sum = 0;
               for(int k= i; k<=j; k++){
                sum+=arr[k];
               }
               System.out.print(sum+" ");
               if(max_Sum<sum){
                max_Sum = sum;
               }
            }
            System.out.println();
        }
        System.out.println(max_Sum);
     }
}
