class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        reverse(arr,0,arr.length-1);

        StringBuilder ans = new StringBuilder();
        int i = 0;
        int n = arr.length;

        while(i < n){
            while(i < n && arr[i] == ' '){
                i++;
            }
            if(i >= n){
                break;
            }
            int start = i;

            while(i < n && arr[i] != ' '){
                i++;
            }
            int end = i -1;
            reverse(arr,start,end);

            if(ans.length() > 0){
                ans.append(" ");
            }
               for (int j = start; j <= end; j++) {
                ans.append(arr[j]);
            }
        }

        return ans.toString();
    }

    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}