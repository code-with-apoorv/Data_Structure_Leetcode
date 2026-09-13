class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int round = 0;
        int i = 0;
        while(i < tasks.length){
            int count = 0;
            int j = i;
            while(j < tasks.length && tasks[j] == tasks[i]){
                count++;
                j++;
            }
            if(count == 1){
                return -1;
            }
            round += count/3;
            if (count % 3 != 0) {
                round++;
            }

            i = j;
        }

        return round;
    }
}