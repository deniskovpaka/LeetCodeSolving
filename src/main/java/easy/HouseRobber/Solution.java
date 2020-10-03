package easy.HouseRobber;

public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int[] m = new int[nums.length];
        m[0] = nums[0];
        m[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; ++i) {
            m[i] = Math.max(nums[i] + m[i - 2], m[i - 1]);
        }

        return m[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 100, 7};
        System.out.println("Res is = " + new Solution().rob(nums));
    }
}
