class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
    //    int n = triangle.size();
    //    int [] front = new int[n];

    //    for(int j = 0 ; j < n; j++){
    //     front[j] = triangle.get(n-1).get(j);
    //    } 

    //    for(int i = n-2; i >= 0; i--){
    //     int[] curr = new int[n];

    //    for(int j = 0; j <= i; j++){
 // i = 2; j = 0,1,2
 // i = 3; j = 0,1,2,3
    //   int d = triangle.get(i).get(j) + front[j];
    //  int diagonal = triangle.get(i).get(j) + front[j + 1];

    //    curr[j]  = Math.min(d,diagonal);
    //    }
    //     front = curr;
    // }
    // return front[0];
    int n = triangle.size();
    int[][] dp = new int[n][n];
    for(int j = 0; j < n;j++){
        dp[n-1][j] = triangle.get(n-1).get(j);
    }
    for(int i = n-2; i >= 0; i--){
        for(int j = 0; j <= i; j++){
            int down = dp[i+1][j];
            int diagonal = dp[i+1][j+1];
            dp[i][j] = triangle.get(i).get(j) + Math.min(diagonal,down);
        }
    }
    return dp[0][0];
}
}