class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int product = 1;
            for(int j = i; j < n; j++){
                product = product * nums[j];
                max = Math.max(product,max);
            }
        }
        return max;
    }
}
//         int n = nums.length;
//         int max = Integer.MIN_VALUE; 
//         int prefix = 1;
//         int suffix = 1;
//         for(int i = 0; i < nums.length;i++){
//             if(prefix == 0){
//                 prefix = 1;
//             }
//             if(suffix == 0){
//                 suffix = 1;
//             }
//           suffix = suffix * nums[n-i-1];
//               prefix = prefix * nums[i];
//             max = Math.max(max,Math.max(prefix,suffix));
//         }
//         return max;
//          }
// }
