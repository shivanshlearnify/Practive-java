// Write a Java program and compute the sum of an integer's digits.

import java.util.*;

public class Q12 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       long a = sc.nextInt();
       long sum = sumDigit(a);
       System.out.println("The sum of the the number is " + sum);
    }

    public static int sumDigit(long a){
         int sum = 0;
         while (a !=0){
            sum += a % 10;
            a /= 10;
         }
         return sum;
    }
}
