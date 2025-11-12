class MinimumFallingPath2 {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n][n];

        // Initialize the first row
        for (int j = 0; j < n; j++) {
            dp[0][j] = grid[0][j];
        }

        // Fill the DP table
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int minPrev = Integer.MAX_VALUE;

                for (int k = 0; k < n; k++) {
                    if (k != j) {
                        minPrev = Math.min(minPrev, dp[i - 1][k]);
                    }
                }

                dp[i][j] = grid[i][j] + minPrev;
            }
        }

        // Find the minimum in the last row
        int result = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            result = Math.min(result, dp[n - 1][j]);
        }

        return result;
    }
    public static void main(String[] args) {
        MinimumFallingPath2 sol = new MinimumFallingPath2();

        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int result = sol.minFallingPathSum(grid);
        System.out.println("Minimum falling path sum: " + result);
    }
}


