class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        int answer = 0;
        for(int i = 0; i < piles.length;i++){
            high = Math.max(piles[i],high);
        }

        while(low <= high){

            int mid = low + (high-low)/2;
            int totalHours = 0;

            for(int i = 0; i < piles.length;i++){
                totalHours += Math.ceil((double) piles[i]/mid);
            }
            if(totalHours <= h){
               answer = mid;
               high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return answer;
    }
}