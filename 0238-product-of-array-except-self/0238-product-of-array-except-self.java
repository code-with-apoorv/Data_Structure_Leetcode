class Solution {
    public int[] productExceptSelf(int[] nums) {
         int n = nums.length;
        int[] left = new int[n+1];
        int[] right = new int[n+1];
        left[0] = 1;
        for(int i = 1; i < nums.length; i++){
            left[i] = left[i-1]*nums[i-1];
        }
        right[nums.length-1] = 1;
        for(int i = nums.length-2; i >= 0; i--){
            right[i] = right[i+1]*nums[i+1];
        }
        int[] ans = new int[n];
        for(int i = 0; i < nums.length;i++){
        ans[i] = left[i] * right[i];
        }
        return ans;

    }
}