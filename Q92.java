public class Q92 {
    public static void main(String args[]){
        int n= 3;
        System.out.println(sum(n));

    }
    public static int sum(int n){
      if(n==1 || n==2){
        return n;
      }
      int x = (sum(n-1)+sum(n-2));
      return x;

    }
}

// fibnoci of ith num