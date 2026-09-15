class Solution {
    public int maximumProduct(int[] nums, int k) {
        int mod = 1000000007;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < nums.length;i++){
            pq.add(nums[i]);
        }
        for(int i = 0; i < k; i++){
            int smallest = pq.remove();
            smallest++;
            pq.add(smallest);
        }
        long product = 1;
        for(int i = 0; i < nums.length;i++){
            product = product * pq.remove();
            product = product % mod;
        }
        return (int) product;
    }
}