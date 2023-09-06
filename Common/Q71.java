

public class Q71 {
    public static void main(String args[]){
    //   int n = 149;
    //   int k = 3;
      System.out.println(clear(7, 1));
    }

    public static void evenOrOdd(int n){
        int bitMask = 1;
        if((n & bitMask)==0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static int getIthbit(int n, int k){
        int bitMask = 1<<k;
        if((n & bitMask)==0){
            return 0;
        } else {
            return 1;
        }
    }
    
    public static int setBIt(int n , int k){
        int bitMask = 1<<k;
        return n|bitMask;
    }

    public static int clear(int n , int k){
        int bitMask = ~(1<<k);
        return n & bitMask;
    }
}
