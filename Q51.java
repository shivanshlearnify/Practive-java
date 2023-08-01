// Mirror image of triangle pattern

public class Q51 {
    public static void main(String args[]){
        int n = 5;
        print(n);
    }
    public static void print(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int j=i; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int j=i; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
