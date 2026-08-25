class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxi = 0;
        for (int num : map.keySet()) {
            if (map.containsKey(num + 1)) {
                int count = map.get(num) + map.get(num + 1);
                maxi = Math.max(maxi, count);
            }
        }
        return maxi;
    }
}