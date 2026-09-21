class Solution {
    int[] dp;
    int uniqueBST(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int count = 0;
        for(int i = 1; i <= n; i++){
            count+= uniqueBST(i-1) * uniqueBST(n-i);
        }
        return dp[n] = count;
    }
    public int numTrees(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return uniqueBST(n);
    }
}