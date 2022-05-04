package medium.UniquePaths;

public class Solution {
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        int[][] paths = new int[m][n];
        paths[0][0] = 0;
        for (int i = 1; i < m; ++i) {
            paths[i][0] = 1;
        }
        for (int i = 1; i < n; ++i) {
            paths[0][i] = 1;
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                paths[i][j] = paths[i][j - 1] + paths[i - 1][j];
            }
        }
        return paths[m - 1][n - 1];
    }
}
