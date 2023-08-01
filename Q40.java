// Diamond pattern

public class Q40 {
    public static void main(String args[]){
       int n = 5;
       print(n);
    }
    public static void print(int n){
          for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
          }
          for(int i= n-1; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
          }
    }
}
