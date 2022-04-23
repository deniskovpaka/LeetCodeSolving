package easy.RectangleOverlap;

class Solution {
    private boolean valueInRange(int value, int min, int max) {
        return (value > min) && (value < max);
    }
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x11 = rec1[0];
        int x12 = rec1[2];
        int y11 = rec1[1];
        int y12 = rec1[3];

        int x21 = rec2[0];
        int x22 = rec2[2];
        int y21 = rec2[1];
        int y22 = rec2[3];

        boolean isXOverlap = valueInRange(x11, x21, x22) || valueInRange(x21, x11, x12);
        boolean isYOverlap = valueInRange(y11, y21, y22) || valueInRange(y21, y11, y12);
        return isXOverlap && isYOverlap;
    }

    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 0) return 0;
        else if (n == 1) return nums[0];

        int[] sol = new int[n];
        sol[0] = nums[0];
        sol[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            sol[i] = Math.max(sol[i-2] + nums[i], sol[i-1]);
        }
        return sol[n-1];
    }

    public static void main(String[] args) {
        int[] rec1 = {2, 3, 8, 2, 3, 4};
        int rob = new Solution().rob(rec1);
        System.out.println("Res = " + rob);
    }
}