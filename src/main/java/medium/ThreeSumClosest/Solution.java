package medium.ThreeSumClosest;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; ++i) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int closest = nums[i] + nums[left] + nums[right];
                if (closest == target) {
                    return closest;
                } else if (closest > target) {
                    --right;
                } else {
                    ++left;
                }
                if (Math.abs(closest - target) < Math.abs(res - target)) {
                    res = closest;
                }
            }
        }
        return res;
    }
}
