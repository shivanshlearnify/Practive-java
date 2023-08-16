import java.util.*;

public class Getithbit {
    public static void main(String args[]){
        int n=3;
        int i=1;
        print(n, i);
    }

    public static void print(int n, int i){
        int bitmask = 1<<i;
        if((bitmask & n)==0){
          System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}
