// For a given 3 digit number, find whether it is armstrong number or not. An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. Return "Yes" if it is a armstrong number else return "No".
// NOTE: 371 is an Armstrong number 

public class Q60 {
    public static void main(String args[]){
        int n = 371;
        int sum = find(n);
        if(sum==n){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
     }
     public static int find(int n){
        
        int count = String.valueOf(n).length();
        int sum = 0;
        while(n!=0){
           int lastDigit = n%10;
           sum += Math.pow(lastDigit, count);
           n /= 10;
            
        }
        return sum;
       
         
     }
      
}
