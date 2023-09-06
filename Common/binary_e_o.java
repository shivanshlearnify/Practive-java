import java.util.*;

public class binary_e_o {
    public static void main(String args[]){
        int n = 4;
        int i = 1;
       find(n, i);

    }
    public static void find (int n,int i){
        int bitmask = 1;
        if((n&bitmask)==0){
          System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
