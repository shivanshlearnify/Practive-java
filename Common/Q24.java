// Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms) 



public class Q24 {
    public static void main(String args[]){
        int sum = 0;
        for(int i=1; i<=5; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
