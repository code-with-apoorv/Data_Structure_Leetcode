class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int xor = 0;
        // for(int i = 0; i < n; i++){
        //     xor = xor ^ i;     // combining index and number at index
        //     xor = xor ^ nums[i];
        // }
        // xor = xor ^ n;
        // return xor;
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        int total = n*(n+1)/2;
        return total - sum;
    }
}