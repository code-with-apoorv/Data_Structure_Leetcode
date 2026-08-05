class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
        // Euclidean algorithm starts here 
        while(min > 0 && max > 0){
            if(min > max){
                min = min % max;
            }
            else{
                max = max % min;
            }
        }
        if(min == 0){
            return max;
        }
        return min;
    }
}