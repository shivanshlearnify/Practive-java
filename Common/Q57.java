// You are given a number N. You need to print the pattern for the given value of N.

// For N = 2 the pattern will be 
// 2 2 1 1
// 2 1

public class Q57 {
    public static void main(String args[]){
        int n = 3;
        find(n);
     }
     public static void find(int n){
         
         for(int i=n; i>=1; i--){
             for(int j=n; j>=1; j--){
                for(int k=1; k<=i; k++){
                    System.out.print(j);
                }
             }
             System.out.println();
         }
         
     }
}
