class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(map.values());
        int removed = 0;
        int count = 0;
        int target = arr.length/2;
        while(removed < target){
            removed += maxHeap.poll();
            count++;
        }
        return count;
    }
}