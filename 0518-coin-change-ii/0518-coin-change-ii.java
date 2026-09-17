class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];

        for(int i = 0; i <= amount; i++){
            if(i % coins[0] == 0){
                dp[0][i] = 1;
            }
        }
        for(int i = 1; i < n; i++){
            for(int target = 0; target <= amount; target++){
                int notTake = dp[i-1][target];
                int take = 0;
                if(coins[i] <= target){
                    take = dp[i][target-coins[i]];
                }
                dp[i][target] = notTake + take;
            }
        }
        return dp[n-1][amount];
    }
}