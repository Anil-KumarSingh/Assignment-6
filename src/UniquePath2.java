import java.util.*;
class UniquePath2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int [][] dp=new int[m][n];
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return countPaths(obstacleGrid, m - 1, n - 1,dp);
    }

    private int countPaths(int[][] grid, int i, int j,int[][] dp) {
        // Out of bounds or obstacle
        if (i < 0 || j < 0 || grid[i][j] == 1) return 0;

        // Reached start
        if (i == 0 && j == 0) return 1;
        if(dp[i][j]!=-1) return dp[i][j];


        dp[i][j]= countPaths(grid, i - 1, j,dp) + countPaths(grid, i, j - 1,dp);
        return dp[i][j];
    }
    public static void main(String[] args) {
        UniquePath2 sol = new UniquePath2();

        int[][] obstacleGrid = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        int result = sol.uniquePathsWithObstacles(obstacleGrid);
        System.out.println("Number of unique paths: " + result);
    }
}


