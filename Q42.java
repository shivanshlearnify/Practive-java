// Square pattern

public class Q42 {
    public static void main(String args[]){
       int n = 5;
       print(n);
    }
    public static void print(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
