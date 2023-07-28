// Write a Java program to compare two numbers.

// Test Data:
// Input first integer: 25
// Input second integer: 39

import java.util.*;

public class Q11 {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a==b) 
        System.out.println(a + " is equal to " +b);
        if (a<b) 
        System.out.println(a + " is smaller than " +b);
        if (a>b) 
        System.out.println(a + " is greater than " +b);
        if (a!=b) 
        System.out.println(a + " is not equal to " +b);
       
     }   
 }
