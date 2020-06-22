package medium.FindPeakElement;

public class Solution {
    public int findPeakElement(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 7, 2};
        int peakElement = new Solution().findPeakElement(nums);
        System.out.println("Pos = " + peakElement);
    }
}
