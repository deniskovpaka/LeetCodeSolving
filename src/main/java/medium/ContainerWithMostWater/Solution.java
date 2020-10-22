package medium.ContainerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; ++i) {
            for (int j = 0; j < height.length; ++j) {
                int l = Math.min(height[i], height[j]);
                int w = Math.abs(i - j);
                int area = l * w;
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1,2,1};
        System.out.println("Res = " + new Solution().maxArea(height));
    }
}
