class Solution {
    public int findPairs(int[] nums, int k) {

        if (k < 0) {
            return 0;
        }

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> pairs = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (seen.contains(nums[i] - k)) {
                pairs.add(nums[i] - k);
            }

            if (seen.contains(nums[i] + k)) {
                pairs.add(nums[i]);
            }

            seen.add(nums[i]);
        }

        return pairs.size();
    }
}