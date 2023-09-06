public class divide2Num {
    
    public static int divide (int a, int b){
        int product = a/b;
        return product;
    }
    public static void main(String args[]){
        int a = 20;
        int b = 5;
        int prod = divide(a, b);
        System.out.println("a / b = "+ prod);
    }
}
