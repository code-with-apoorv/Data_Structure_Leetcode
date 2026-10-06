class Solution {
    public int countHomogenous(String s) {
        long count = 1;
        long ans = 1;
        long mod = 1000000007;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else{
                count = 1;
            }
            ans = (ans + count) % mod;
        }
        return (int) ans;
    }
}