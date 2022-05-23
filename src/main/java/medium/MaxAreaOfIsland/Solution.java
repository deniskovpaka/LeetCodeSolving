package medium.MaxAreaOfIsland;

public class Solution {
    private int maxCount = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxArea = 0;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == 1) {
                    countArea(grid, i, j, m, n, 1);
                    if (maxCount > maxArea) {
                        maxArea = maxCount;
                        maxCount = 0;
                    }
                }
            }
        }
        return maxArea;
    }

    private int countArea(int[][] grid, int i, int j, int m, int n, int count) {
        grid[i][j] = 0;
        if (j + 1 < n && grid[i][j + 1] == 1) {
            count = countArea(grid, i, j + 1, m, n, count + 1);
        }
        if (i + 1 < m && grid[i + 1][j] == 1) {
            count = countArea(grid, i + 1, j, m, n, count + 1);
        }
        if (j - 1 >= 0 && grid[i][j - 1] == 1) {
            count = countArea(grid, i, j - 1, m, n, count + 1);
        }
        if (i - 1 >= 0 && grid[i - 1][j] == 1) {
            count = countArea(grid, i - 1, j, m, n, count + 1);
        }
        if (count > maxCount) {
            maxCount = count;
        }
        return count;
    }
}
