package easy.MissingNumber;

public class Solution {
    public int missingNumber(int[] nums) {
        int res = 0;
        int numsSum = 0;
        for (int i = 0; i < nums.length; ++i) {
            res += i + 1;
            numsSum += nums[i];
        }

        return res - numsSum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println("Res = " + new Solution().missingNumber(nums));
    }
}
