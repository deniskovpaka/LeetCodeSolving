package medium.SetMatrixZeroes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = new int[3][4];
        for (int[] ints : matrix) {
            Arrays.fill(ints, 1);
        }
        matrix[0][0] = 0;
        matrix[0][3] = 0;
        solution.setZeroes(matrix);
    }
}
