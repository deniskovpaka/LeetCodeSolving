package medium.SetMatrixZeroes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> rows = new ArrayList<>();
        List<Integer> columns = new ArrayList<>();

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (matrix[i][j] == 0) {
                    addDigitToArrayIfNotPresent(rows, i);
                    addDigitToArrayIfNotPresent(columns, j);
                }
            }
        }

        setRowsToZero(matrix, rows);
        setColumnToZero(matrix, columns);
        System.out.println(Arrays.deepToString(matrix));
    }

    private void setColumnToZero(int[][] matrix, List<Integer> columns) {
        for (int column : columns) {
            for (int i = 0; i < matrix.length; ++i) {
                matrix[i][column] = 0;
            }
        }
    }

    private void setRowsToZero(int[][] matrix, List<Integer> rows) {
        for (int row : rows) {
            Arrays.fill(matrix[row], 0);
        }
    }

    private void addDigitToArrayIfNotPresent(List<Integer> array, int digit) {
        if (!array.contains(digit)) {
            array.add(digit);
        }
    }
}