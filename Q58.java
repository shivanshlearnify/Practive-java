
// Given an array arr[] of N integers, calculate the median
import java.util.*;

public class Q58 {
    public static void main(String args[]) {
        int arr[] = { 56, 67, 30, 79 };
        find(arr);
    }

    public static void find(int arr[]) {
        Arrays.sort(arr);

        int n = arr.length;
        if (n % 2 == 0) {
            int mid1 = arr[n/2] ;
            int mid2 = arr[n/2-1] ;
           
            System.out.println((mid1+mid2)/2);
        } else {
            System.out.println(arr[n / 2]);
        }

    }
}
