class Solution {
    public boolean canPartition(int[] arr) {
        int n = arr.length;
        // Calculate total sum
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        // If total sum is odd, equal partition is not possible
        if (totalSum % 2 != 0) {
            return false;
        }
        // Each subset should have this sum
        int targetSum = totalSum / 2;
        // DP table
        boolean[][] dp = new boolean[n][targetSum + 1];
        // Sum 0 is always possible
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }
        // Using only the first element
        if (arr[0] <= targetSum) {
            dp[0][arr[0]] = true;
        }
        // Fill the DP table
        for (int index = 1; index < n; index++) {
            for (int target = 1; target <= targetSum; target++) {
                // Don't take current element
                boolean notTaken = dp[index - 1][target];
                // Take current element
                boolean taken = false;
                if (arr[index] <= target) {
                    taken = dp[index - 1][target - arr[index]];
                }
                // If either is possible
                dp[index][target] = notTaken || taken;
            }
        }
        // Last row + target sum
        return dp[n - 1][targetSum];
    }
}