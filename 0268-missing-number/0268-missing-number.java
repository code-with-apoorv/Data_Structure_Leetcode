class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for(int i = 0; i < n; i++){
            xor = xor ^ i;     // combining index and number at index
            xor = xor ^ nums[i];
        }
        xor = xor ^ n;
        return xor;
    }
}