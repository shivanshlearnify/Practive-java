// Write a Java program that accepts three integers from the user. It returns true if the second number is higher than the first number and the third number is larger than the second number

import java.util.*;
public class Q15 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        find(a, b, c);
    }
    public static void find(int a, int b, int c){
        if(c>b && b>a){
            System.out.println("true");  
        } else {
            System.out.println("false");
        }
    }
}
