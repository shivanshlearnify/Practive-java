// Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.*;

public class Q16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");

        int a = sc.nextInt();
        find(a);

    }
    public static void find (int a){
        if (a>0 || a==0){
            System.out.println("number is positive");
        } else {
            System.out.println("number is negative");
        }
    }
    
}
