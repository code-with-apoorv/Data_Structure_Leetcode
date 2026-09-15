class Solution {

    public int cherryPickup(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[][][] dp = new int[n][m][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return solve(0, 0, m - 1, grid, dp);
    }

    public int solve(int i, int j1, int j2,
                     int[][] grid, int[][][] dp) {

        // Out of boundary
        if (j1 < 0 || j1 >= grid[0].length ||
            j2 < 0 || j2 >= grid[0].length) {
            return -1000000000;
        }

        // Last row
        if (i == grid.length - 1) {

            if (j1 == j2) {
                return grid[i][j1];
            }

            return grid[i][j1] + grid[i][j2];
        }

        // Already calculated
        if (dp[i][j1][j2] != -1) {
            return dp[i][j1][j2];
        }

        int maxi = -1000000000;

        // Robot 1 moves -1, 0, +1
        // Robot 2 moves -1, 0, +1
        for (int dj1 = -1; dj1 <= 1; dj1++) {

            for (int dj2 = -1; dj2 <= 1; dj2++) {

                int cherries;

                if (j1 == j2) {
                    cherries = grid[i][j1];
                } else {
                    cherries = grid[i][j1] + grid[i][j2];
                }

                cherries += solve(i + 1,
                                  j1 + dj1,
                                  j2 + dj2,
                                  grid,
                                  dp);

                maxi = Math.max(maxi, cherries);
            }
        }

        return dp[i][j1][j2] = maxi;
    }
}