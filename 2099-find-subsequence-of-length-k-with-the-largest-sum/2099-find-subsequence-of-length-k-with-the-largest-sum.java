import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]
        );
        for (int i = 0; i < nums.length; i++) {
            pq.add(new int[]{nums[i], i});
        }
        int[][] selected = new int[k][2];

        for (int i = 0; i < k; i++) {
            selected[i] = pq.poll();
        }

        Arrays.sort(selected, (a, b) -> a[1] - b[1]);
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = selected[i][0];
        }

        return result;
    }
}