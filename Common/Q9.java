// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class Q9 {

    public static int average (int a, int b, int c){
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = average(a, b, c);
        System.out.println("the average of "+ a + " " + b + " "  + c + " is " + avg);


    }
    
}
