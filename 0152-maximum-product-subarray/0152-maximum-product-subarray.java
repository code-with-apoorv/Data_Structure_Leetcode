class Solution {
    public int maxProduct(int[] nums) {
        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i < nums.length;i++){
        // int product = 1;
        // for(int j = i; j < nums.length;j++){
        // product = product*nums[j];
        // max = Math.max(product,max);
        // }
        // }
        // return max;
        int n = nums.length;
        int max = Integer.MIN_VALUE; 
        int prefix = 1;
        int suffix = 1;
        for(int i = 0; i < nums.length;i++){
            if(prefix == 0){
                prefix = 1;
            }
            if(suffix == 0){
                suffix = 1;
            }
            prefix = prefix * nums[i];
            suffix = suffix * nums[n-i-1];
            max = Math.max(max,Math.max(prefix,suffix));
        }
        return max;
         }
}
