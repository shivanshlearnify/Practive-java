// 50. Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.

public class Q13 {
      public static void main (String args[]){
        for(int i=1; i<=10; i++){
            if (( i % 3) == 0){
                System.out.print(i+",");
            }
        }
      }    
}
