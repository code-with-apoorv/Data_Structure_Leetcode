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
       int zero = 0;
       int maxi = 0;
       int left = 0;

       for(int right = 0; right<nums.length; right++){
        if(nums[right] == 0)zero++;
        while(left < nums.length && zero>k){
            if(nums[left] == 0){
                zero--;
            }left++;
        }
        maxi = Math.max(maxi, right-left+1);
       }
       return maxi;
    }
}