public class Setthebitmask {

    public static void main(String args[]){
        int n = 6;
        int i = 1;
        print(n, i);
    }
   public static void print(int n, int i){
    int bitmask = ~(1<<i);
    System.out.println(n&bitmask);
}


}

