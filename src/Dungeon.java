import java.util.*;
class Dungeoqn {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;

        int[][] dp = new int[m + 1][n + 1];

        // Initialize with max value
        for (int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }

        // Set the cell beyond the princess's room to 1
        dp[m][n - 1] = 1;
        dp[m - 1][n] = 1;

        // Fill the DP table from bottom-right to top-left
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int minHealthOnExit = Math.min(dp[i + 1][j], dp[i][j + 1]);
                dp[i][j] = Math.max(1, minHealthOnExit - dungeon[i][j]);
            }
        }

        return dp[0][0];
    }
    public static void main(String[] args) {
        Dungeoqn sol = new Dungeoqn();

        int[][] dungeon = {
                {-2, -3, 3},
                {-5, -10, 1},
                {10, 30, -5}
        };

        int result = sol.calculateMinimumHP(dungeon);
        System.out.println("Minimum initial health required: " + result);
    }
}

