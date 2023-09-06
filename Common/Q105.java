import java.util.Scanner;

public class Q105 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number: ");
        double imaginary1 = scanner.nextDouble();

        System.out.println("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number: ");
        double imaginary2 = scanner.nextDouble();

        Complex complex1 = new Complex(real1, imaginary1);
        Complex complex2 = new Complex(real2, imaginary2);

        System.out.println("Complex Number 1:");
        complex1.display();

        System.out.println("Complex Number 2:");
        complex2.display();

        Complex sum = complex1.add(complex2);
        System.out.println("Sum:");
        sum.display();

        Complex difference = complex1.subtract(complex2);
        System.out.println("Difference:");
        difference.display();

        Complex product = complex1.multiply(complex2);
        System.out.println("Product:");
        product.display();

        scanner.close();
    }
}
 class Complex {
    private double real;
    private double imaginary;

    // Constructor to initialize the complex number
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    // Method to calculate the sum of two complex numbers
    public Complex add(Complex other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        return new Complex(realSum, imaginarySum);
    }

    // Method to calculate the difference of two complex numbers
    public Complex subtract(Complex other) {
        double realDiff = this.real - other.real;
        double imaginaryDiff = this.imaginary - other.imaginary;
        return new Complex(realDiff, imaginaryDiff);
    }

    // Method to calculate the product of two complex numbers
    public Complex multiply(Complex other) {
        double realProduct = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryProduct = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(realProduct, imaginaryProduct);
    }

    // Method to display the complex number
    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}
