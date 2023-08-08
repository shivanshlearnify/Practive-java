// reverse a number

public class Q62 {
    public static void main(String args[]){
        int n = 10899;
        find(n);
     }
     public static void find(int n){
         while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            // to remove last digit
            n /= 10;
         }
         System.out.println();
         
     }
}
