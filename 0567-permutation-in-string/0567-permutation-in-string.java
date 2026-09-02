class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        int windSize = s1.length();
        for (int i = 0; i < s2.length(); i++) {
            int[] windFreq = new int[26];
            int windIdx = 0;
            int idx = i;
            while (windIdx < windSize && idx < s2.length()) {
                windFreq[s2.charAt(idx) - 'a']++;
                windIdx++;
                idx++;
            }
            if (isFreqSame(freq, windFreq)) {
                return true;
            }
            if (idx >= s2.length()) {
                break;
            }
        }
        return false;
    }
    public boolean isFreqSame(int[] freq, int[] windFreq) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] != windFreq[i]) {
                return false;
            }
        }
        return true;
    }
}