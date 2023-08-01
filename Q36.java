// Number Triangular

public class Q36 {
    public static void main(String args[]){
        int n = 4;
        print(n);

    }
    public static void print(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
