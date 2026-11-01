class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int moves = 0;
        for(int i = 1; i < n; i++){
            moves = moves + (nums[i] - nums[0]);
        }
        return moves;
    }
}