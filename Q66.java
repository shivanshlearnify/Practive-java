
   import java.util.*;
   
   public class Q66 {
    public static void main(String args[]){
    int arr [][] =      {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
      PrintCol(arr);
       
         
       }

       public static void PrintCol(int arr[][]){
          
          for(int i=0; i<arr.length; i++){
              System.out.println(arr[i][i]);
                }
            }
          
}