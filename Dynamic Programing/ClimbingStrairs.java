import java.util.*;

public class ClimbingStrairs {

    // public static int climbingStairs(int n){
        // Recurrsion
    // if(n==0){
    // return 1;
    // }
    // if(n<0){
    // return 0;
    // }
    // return climbingStairs(n-1)+climbingStairs(n-2);
    // }
    public static int climbingStairs(int n, int ways[]){
        // Memomization
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n]!=-1){
            return ways[n];
        }
        ways[n] =  climbingStairs(n-1, ways) + climbingStairs(n-2, ways);
        return ways[n];
    }
    public static int countWays(int n){
        int dp [] = new int[n+1];

        dp[0] = 1;
        for(int i=1; i<=n; i++){
            if(i==1){
                dp[i]= dp[i-1];
            } else {
                dp[i]= dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }

    public static void main(String args[]) {
        int n = 5;
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);
        System.out.println(climbingStairs(n, ways));
        System.out.println(countWays(n));
    }
}