public class Q90 {
    public static void main(String args[]){
        int n = 3;
       System.out.println(fac(n));
    }

    public static int fac(int n){
         if(n==0){
            return 1;
         }
        // int fn1 = fac(n-1);
        // int fn = n*fn1;
        return n * fac(n-1);
    }
}

// factorial of n with recursion