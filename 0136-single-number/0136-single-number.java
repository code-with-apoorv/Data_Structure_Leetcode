class Solution {
    public int singleNumber(int[] nums) {
     int value = 0;
     for(int i=0; i<nums.length; i++){
           value = value^nums[i];
        }
        return value;
    }
    }

    // Bruteforce approach
    //int n = arr.length;

    // for(int i = 0; i<n; i++){
    // int num = arr[i];
    // int cnt = 0;

    // for(int j = 0; j<n; j++){
    // if(arr[j] == num)
    //cnt++;
    //}    
   //  if(cnt == 1) return num;
   // } 
 //return -1   }
