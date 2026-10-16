class Solution {
    public void sortColors(int[] nums) {
        // Brute force approach
        // By using bubble sort i am sort these
     //   int n = nums.length;
       // for(int i = 0; i<n-1; i++){

         //   for(int j = 0; j<n-i-1; j++){
           //     if(nums[j] > nums[j+1]){
             //       int temp =  nums[j];
               //     nums[j] = nums[j+1];
                 //   nums[j+1] = temp;
                //}
        //    }
        //}
                  // optimal approach
     

        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}
