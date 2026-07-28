class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] count = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            count[i] = 1;
        }
        int maxi = 1;
        for (int i = 0; i < n; i++) {
            for (int prev = 0; prev < i; prev++) {
                if (nums[prev] < nums[i] && dp[prev] + 1 > dp[i]) {
                    dp[i] = dp[prev] + 1;
                    count[i] = count[prev];
                }
                else if (nums[prev] < nums[i] && dp[prev] + 1 == dp[i]) {
                    count[i] += count[prev];
                }
            }
            maxi = Math.max(maxi, dp[i]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == maxi) {
                ans += count[i];
            }
        }
        return ans;
    }
}