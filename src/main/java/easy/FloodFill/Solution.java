package easy.FloodFill;

import java.util.Arrays;

public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (newColor == image[sr][sc]) {
            return image;
        }
        int oldColor = image[sr][sc];
        image[sr][sc] = newColor;
        floodFill(image, sr, sc, newColor, oldColor);
        return image;
    }

    private void floodFill(int[][] image, int row, int column, int newColor, int oldColor) {
        if (row - 1 >= 0 && image[row - 1][column] == oldColor) {
            image[row - 1][column] = newColor;
            floodFill(image, row - 1, column, newColor, oldColor);
        }
        if (row + 1 < image.length && image[row + 1][column] == oldColor) {
            image[row + 1][column] = newColor;
            floodFill(image, row + 1, column, newColor, oldColor);
        }
        if (column - 1 >= 0 && image[row][column - 1] == oldColor) {
            image[row][column - 1] = newColor;
            floodFill(image, row, column - 1, newColor, oldColor);
        }
        if (column + 1 < image[0].length && image[row][column + 1] == oldColor) {
            image[row][column + 1] = newColor;
            floodFill(image, row, column + 1, newColor, oldColor);
        }
    }

    public static void main(String[] args) {
//        int[][] image = {
//                {1, 1, 1},
//                {1, 1, 0},
//                {1, 0, 1}
//        };
//        int[][] res = new Solution().floodFill(image, 1, 1, 2);
        int[][] image = {
                {0, 0, 0},
                {0, 1, 1}
        };
        int[][] res = new Solution().floodFill(image, 1, 1, 1);
        System.out.println(Arrays.deepToString(res));
    }
}
