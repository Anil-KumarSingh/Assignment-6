
public class FrogKthJump {

    private static int ans(int[] height, int n, int k) {
        // Base case
        if (n == 0) return 0;

        int minCost = Integer.MAX_VALUE;

        // Try all jumps from 1 to k
        for (int i = 1; i <= k; i++) {
            if (n - i >= 0) {
                int jumpCost = ans(height, n - i, k) + Math.abs(height[n] - height[n - i]);
                minCost = Math.min(minCost, jumpCost);
            }
        }

        return minCost;
    }

    public static int minCost(int[] height, int k) {
        int n = height.length;
        return ans(height, n - 1, k);
    }

    public static void main(String[] args) {
        int[] height = {10, 30, 40, 50, 20};
        int k = 3;
        System.out.println("Minimum cost to reach destination: " + minCost(height, k));
    }
}