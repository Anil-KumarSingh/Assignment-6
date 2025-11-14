//path to check from source to destination


import java.util.*;

public class SourceDestination {

    // Function to check if a path exists from (0,0) to (n-1,n-1)
    private static boolean isPossible(List<List<Integer>> grid, int x, int y, int n, boolean[][] visited) {
        // Base case:
        if (x == n - 1 && y == n - 1 && grid.get(x).get(y) == 0) {
            return true;
        }

        // Check boundaries and obstacles
        if (x < 0 || y < 0 || x >= n || y >= n || grid.get(x).get(y) == 1 || visited[x][y]) {
            return false;
        }

        // Mark current cell as visited
        visited[x][y] = true;

        // Try moving 2 directions: right, down
        boolean right = isPossible(grid, x, y + 1, n, visited);
        boolean down = isPossible(grid, x + 1, y, n, visited);

        // Unmark the cell (backtrack)
        visited[x][y] = false;

        // Return true if any path works
        return right || down;
    }

    public static void main(String[] args) {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(List.of(0, 0, 0, 1));
        grid.add(List.of(0, 1, 0, 0));
        grid.add(List.of(0,0 , 1, 0 ));
        grid.add(List.of(0, 0, 0, 0));

        int n = grid.size();
        boolean[][] visited = new boolean[n][n];

        boolean possible = isPossible(grid, 0, 0, n, visited);
        System.out.println("Path exists from source to destination: " + possible);
    }
}