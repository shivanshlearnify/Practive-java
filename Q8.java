// Write a Java program to print the area and perimeter of a circle.
// Test Data:
// Radius = 7.5
// Expected Output
// Perimeter is = 47.12388980384689
// Area is = 176.71458676442586
public class Q8 {
    public static void main(String args[]){
        double a = 7.5;
        System.out.println("area of "+ a +" is "+ area(a) + " , "+ "perimeter of "+ a + " is " + perimeter(a)); 
    }
    public static double area(double a){
        double solution = Math.PI * a * a;
        return solution;
    }
    public static double perimeter(double a){
        double solution = 2 * Math.PI * a;
        return solution;
}
}

