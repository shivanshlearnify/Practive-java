// Print numbers from 1 to N without the help of loops.



public class Q28 {
    public static void main(String args[]){
        int n = 10;
        find(n);
         
    }
    public static void find(int n){
        if(n==0){
            return;
        } else {
          find(n-1);
          System.out.print(n+" ");
        }
    }
    
}
