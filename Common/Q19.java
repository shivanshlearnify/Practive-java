//  Write a Java program that takes a year from the user and prints whether it is a leap year or not.

import java .util.*;

public class Q19 {
     public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      find(a);

     }
     public static void find (int a){
        if(a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)){
            System.out.println("is leap year");
        } else {
            System.out.println("not a leap year");
        }
     }  

}
