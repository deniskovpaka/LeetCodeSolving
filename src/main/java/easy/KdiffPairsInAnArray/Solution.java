package easy.KdiffPairsInAnArray;

import java.util.Arrays;

class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;
        Arrays.sort(nums);
        int left = 0, right = 1, count = 0;
        while (right < nums.length) {
            if (nums[right] - nums[left] > k) {
                left++;
            } else if (nums[right] - nums[left] < k || right == left) {
                right++;
            } else {
                count++;
                left++;
                right++;
                while (right < nums.length && nums[right] == nums[right - 1]) right++;
            }
        }
        return count;
    }

    private void showData() {
        System.out.println("Res = " + 5);
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5};
        int k = 2;
        System.out.println("Res = " + new Solution().findPairs(nums, k));
    }
}
