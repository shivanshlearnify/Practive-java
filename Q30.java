// You are given a number N. You need to print the pattern for the given value of N.

// For N = 2 the pattern will be 
// 2 2 1 1
// 2 1

// For N = 3 the pattern will be 
// 3 3 3 2 2 2 1 1 1
// 3 3 2 2 1 1
// 3 2 1
public class Q30 {
    public static void main(String args[]){
        int n=3;
        pattern(n);
         
    }
    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>=1; j--){
                for(int k=i; k<=n; k++){
                   System.out.print(j+" ");
                }
               
            }
            System.out.println();
        }
    }
}
