import java.util.*;

public class Inbuit {
    public static void print(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String args[]){
        Integer arr[] = {3,2,5,1,7,4,9,6};
        Arrays.sort(arr,Collections.reverseOrder());
        print(arr);
    }
}
