class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        if(sum % 3 != 0){
            return false;
        }
        int count = 0;
        int k = sum / 3;
        int current = 0;
        for(int i = 0; i < n; i++){
            current += arr[i];
            if(current == k){
            count++;
            current = 0;
            }
        }
        return count >= 3;
    }
}