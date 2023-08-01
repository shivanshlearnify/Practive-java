// Given a number N. Count the number of digits in N which evenly divides N.

// Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided

public class Q31 {
    public static void main(String args[]){
      int n=12;
      int count =find(n);
      System.out.println(count);
    }
    public static int find(int n){
        int count =0;
        while(n>0){
            int lastDigit = n%10;
            if(n%lastDigit==0){
                count++;
            }
            n /= 10;

        }
        return count;
    }
}
