class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int MIN = Integer.MAX_VALUE;

        int[][] dp = new int[n][amount+1];

        for(int target = 0; target <= amount; target++){
            if(target % coins[0] == 0){
                dp[0][target] = target/coins[0];
            }
            else{
                dp[0][target] = Integer.MAX_VALUE;
            }
        }

        for(int index = 1; index < n; index++){
            for(int target = 1; target <= amount; target++){
               int notTake = dp[index-1][target];
               int take = MIN;
                    if (coins[index] <= target) {

                    if (dp[index][target - coins[index]] != MIN) {
                        take = 1 + dp[index][target - coins[index]];
                    }
                }
               dp[index][target] = Math.min(take,notTake);
            }
        }
         if(dp[n-1][amount] == MIN){
          return -1;
        }
        return dp[n-1][amount];
    }
}