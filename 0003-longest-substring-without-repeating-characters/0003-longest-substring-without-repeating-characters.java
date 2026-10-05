class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxSum = 0;
        HashSet<Character> set = new HashSet<>();
        for(right = 0; right < s.length(); right++){
        while(set.contains(s.charAt(right))){
        set.remove(s.charAt(left));
        left++;
        }
        set.add(s.charAt(right));
        int length = right - left + 1;
        maxSum = Math.max(maxSum,length);
        }
        return maxSum;
    }
}