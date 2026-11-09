class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double sum = 0;
        for(int i = 0; i < nums.length; i++){
            pq.add((double)nums[i]);
            sum += nums[i];
        }
        double target = sum/2;
        int count = 0;
        while(sum > target){
            double largest = pq.poll();
            double half = largest/2;
            sum -= half;
            pq.add(half);
            count++;
        }
        return count;
    }
}