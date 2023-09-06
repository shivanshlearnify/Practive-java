// 31. Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.

import java.util.*;
public class Q22 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        find(a, b, c);

    }
    public static void find(int a, int b, int c){
        if(c>b  && b>a){
            System.out.println("incresaing order");
        }else {
            System.out.println("Decresaing order");
        }
    }
}
