class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] prefix = new long[n+1];
        
        for(int i = 0; i < n; i++){
            prefix[i+1] = prefix[i] + nums[i];
        }
        long maxSum = Long.MIN_VALUE;
        for(int i = 0; i < k; i++){
            long sum = 0;
            for(int j = i; j + k <= n; j+=k){
            long currentSum = prefix[j+k] - prefix[j];
            sum = sum + currentSum;
            if(sum < currentSum){
                sum = currentSum;
            }
            maxSum = Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
}