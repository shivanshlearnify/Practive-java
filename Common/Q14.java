// Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
// Sample Output:

// Input the first number : 5                                             
// Input the second number: 10                                            
// Input the third number : 15 

import java.util.*;

public class Q14 {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        find(a, b, c);
     }    

     public static void find (int a, int b , int c){
        if((a+b)==c){
        System.out.println("true");
      }else{
        System.out.println("false");
      }
        
     }
}
