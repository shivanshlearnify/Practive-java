import java.util.*;

public class indiancoins {
    public static void main(String args[]){
        int coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins);

        int count = 0;
        int ammount = 241;
        for(int i=coins.length-1; i>=0; i--){
           
               while(coins[i]<=ammount){
                 count++;
                 ammount -= coins[i];
               }
          
        }
        System.out.println(count);
    }
}
