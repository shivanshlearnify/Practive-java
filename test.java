import java.util.*;

public class test {
    public static void main(String args[]){
     
     int n = 11;
     int pow = 0;
     int binNum =0;

     while(n>0){
      int rem = n%2;
      binNum = binNum+(rem*(int)Math.pow(10,pow));
      //  binNum = (binNum*10)+rem;

      pow++;
      n = n/2;
     }
     System.out.println(binNum);
     
         
    }
    
}

