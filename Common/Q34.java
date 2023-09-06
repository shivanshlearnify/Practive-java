// Number-increasing reverse Pyramid Pattern

public class Q34 {
    public static void main(String args[]){
        int n=4;
        print(n);
    }
    public static void print(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++ ){
                System.out.print(j);

            }
            System.out.println();
        }
    }
}
