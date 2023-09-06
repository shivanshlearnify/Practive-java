//Write a Java program that takes two numbers as input and displays the product of two numbers.
// Test Data:
// Input first number: 25
// Input second number: 5
// Expected Output :
// 25 x 5 = 125
import java.util.Scanner;

public class Q5 {
    public static int multiply (int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = multiply(a, b);
        System.out.println("product of a and b is "+ product);

    }
}
