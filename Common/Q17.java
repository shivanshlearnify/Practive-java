// 3. Write a Java program that takes three numbers from the user and prints the greatest number.

import java.util.*;
public class Q17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");

        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.println("enter the third number");
        int c = sc.nextInt();
        find(a, b, c);
    }

    public static void find (int a, int b, int c){
        if (a>b && a>c) 
        System.out.println(a + " is greater than all");

        if (b>a && b>c) 
        System.out.println(b + " is greater than all");

        if (c>b && c>a) 
        System.out.println(a + " is greater than all");
    }

}
