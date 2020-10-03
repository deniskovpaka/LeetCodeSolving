package easy.MaximumSubarray;

import java.util.Arrays;

public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }

        int[] m = new int[nums.length];
        m[0] = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            m[i] = Math.max(nums[i] + m[i - 1], nums[i]);
        }

        return Arrays.stream(m)
                .max()
                .getAsInt();
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Res = " + new Solution().maxSubArray(nums));
    }
}
