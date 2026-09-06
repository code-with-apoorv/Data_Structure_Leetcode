class Solution {
    public int longestOnes(int[] nums, int k) {
        // Brute force approach
   //     int maxLen = 0;
    //    for(int i = 0; i < nums.length; i++){
     //       int zeroes = 0;
      //      for(int j = i; j < nums.length; j++){
      //          if(nums[j] == 0){
      //              zeroes++;
          //      }
        //        if(zeroes > k){
            //        break;
              //  }
             //  maxLen = Math.max(maxLen, j-i+1); 
           // }
       // }
       // return maxLen;

       // OPTIMAL APPROACH
       int left = 0; int zerocount = 0; int maxlen = 0;
       for(int right = 0; right < nums.length; right++){
        if(nums[right] == 0){
            zerocount++;
        }
        if(zerocount > k){
            if(nums[left] == 0){
                zerocount--;
            }
            left++;
        }
        maxlen = Math.max(maxlen, right - left + 1);
       }
       return maxlen;
    }
}