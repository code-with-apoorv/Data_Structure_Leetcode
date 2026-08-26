import java.util.*;
// Nhi samajh aya
class KthLargest {

    // Priority Queue (Min Heap)
    PriorityQueue<Integer> pq;

    // Store k
    int k;

    // Constructor
    public KthLargest(int k, int[] nums) {

        this.k = k;

        // Min Heap
        pq = new PriorityQueue<>();

        // Add all numbers
        for (int i = 0; i < nums.length; i++) {

            pq.add(nums[i]);

            // Keep only k largest elements
            if (pq.size() > k) {
                pq.poll();
            }
        }
    }

    // Add a new number
    public int add(int val) {

        // Add new value
        pq.add(val);

        // If more than k elements,
        // remove the smallest
        if (pq.size() > k) {
            pq.poll();
        }

        // Smallest among k largest = kth largest
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */