package backtracking;

import java.util.ArrayList;

public class RatInMaze {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> result = new ArrayList<>();
        if (m[0][0] == 0 || m[n - 1][n - 1] == 0) {
            return result;
        }
        boolean[][] visited = new boolean[n][n];
        solve(m, 0, 0, n, "", result, visited);
        return result;
    }

    private static void solve(int[][] m, int row, int col, int n, String path, 
                             ArrayList<String> result, boolean[][] visited) {
        if (row == n - 1 && col == n - 1) {
            result.add(path);
            return;
        }

        visited[row][col] = true;

        // Down
        if (row + 1 < n && m[row + 1][col] == 1 && !visited[row + 1][col]) {
            solve(m, row + 1, col, n, path + "D", result, visited);
        }

        // Left
        if (col - 1 >= 0 && m[row][col - 1] == 1 && !visited[row][col - 1]) {
            solve(m, row, col - 1, n, path + "L", result, visited);
        }

        // Right
        if (col + 1 < n && m[row][col + 1] == 1 && !visited[row][col + 1]) {
            solve(m, row, col + 1, n, path + "R", result, visited);
        }

        // Up
        if (row - 1 >= 0 && m[row - 1][col] == 1 && !visited[row - 1][col]) {
            solve(m, row - 1, col, n, path + "U", result, visited);
        }

        visited[row][col] = false;
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };
        ArrayList<String> paths = findPath(maze, 4);
        System.out.println("Paths: " + paths);
    }
}
