// Reverse half pyramid

public class Q44 {
    public static void main(String args[]){
        int n = 5;
        print(n);
    }
    public static void print(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
