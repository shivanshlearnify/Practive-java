import java.util.*;

public class inbuiltSort {
    public static void main(String args[]) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr,1 ,5, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
