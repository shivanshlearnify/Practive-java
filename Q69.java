
import java.util.*;

public class Q69 {
    public static void main(String args[]) {
        int arr[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 14;
        
        PrintCol(arr, key);

    }

    public static boolean PrintCol(int arr[][], int key){
          
          int row = 0; int col = arr[0].length-1;

          while(row<arr.length && col>=0){
             
            if(arr[row][col] == key){
                System.out.print(" key found at "+ row + " , "+ col+ " ");
                return true;
            }
            else if(key < arr[row][col]){
                col--;
            } else {
                row++;
            }
          }
          System.out.println("key not found");
          return false;
          
}
}