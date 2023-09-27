public class Knapsack01 {
    public static int knapsack(int val[], int wt[], int w, int n) {
        if (w == 0 || n == 0) {
            return 0;
        }
        if (wt[n - 1] <= w) { // valid case
            // include
            int ans1 = val[n - 1] + knapsack(val, wt, w - wt[n - 1], n - 1);
            // exclude
            int ans2 = knapsack(val, wt, w, n - 1);
            return Math.max(ans1, ans2);
        } else { // not valid
            return knapsack(val, wt, w, n - 1);
        }
    }

    public static int memomization(int val[], int wt[], int w, int n, int dp[][]) {
       
        if (w == 0 || n == 0) {
            return 0;
        }
        if(dp[n][w] != -1){
            return dp[n][w];
        }
        if (wt[n - 1] <= w) { // valid case
            // include
            int ans1 = val[n - 1] + memomization(val, wt, w - wt[n - 1], n - 1, dp);
            // exclude
            int ans2 = memomization(val, wt, w, n - 1, dp);
            dp[n][w] = Math.max(ans1, ans2);
            return dp[n][w];
        } else { // not valid
            dp[n][w] = memomization(val, wt, w, n - 1, dp);
            
            return dp[n][w];
        }
    }
    public static void print(int dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int knapsackTab(int val[], int wt[], int w){
        int n = val.length;
        int dp[][] = new int[n+1][w+1];
        
        for(int i=0; i<dp.length; i++){  // 0th col
            dp[i][0] = 0;
        }
        for(int j=0; j<dp[0].length; j++){ // 0th row
            dp[0][j] = 0;
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<w+1; j++){
                int v = val[i-1];  // ith item value
                int W = wt[i-1];   // ith item wt
                if(W<=j){ // valed case
                    int incProfit = v + dp[i-1][j-W];
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else { //invalid
                    dp[i][j] =dp[i-1][j];
                }

            }
        }
        // print(dp);
        return dp[n][w];
        
         
    }
    

    public static void main(String args[]) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int w = 7;
        int dp[][] = new int[val.length + 1][w + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(memomization(val, wt, w, val.length, dp));
        // System.out.println(knapsackTab(val, wt, w));

        // for printing memomization 2D array
        // for (int i = 0; i < dp.length; i++) {
        //     for (int j = 0; j < dp[0].length; j++) {
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}
