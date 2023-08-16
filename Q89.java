public class Q89 {
    public static void main(String args[]){
        int n = 10;
        printnto1(n);
    }

    public static void printnto1(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        } 
        
        printnto1(n-1);
        System.out.print(n+" ");
    }
}



// print increasing num from recursion
