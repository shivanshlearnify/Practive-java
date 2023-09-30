public class CatalanNumber_With_Recursion {
    public static int find(int n){
        int ans = 0;
      if(n==0 || n==1){
        return 1;
      }
      for(int i=0; i<=n-1; i++){
        ans += find(i)*find(n-i-1);
      }
      return ans;

    }
    public static void main(String args[]){
        int n=4;
        System.out.println(find(n));
    }
}
