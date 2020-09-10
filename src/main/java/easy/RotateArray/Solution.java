package easy.RotateArray;

public class Solution {
    public void rotate(int[] nums, int k) { // k = 2
//        k %= nums.length;
        // {0,1,2,3,4}

        reverse(nums, 0, nums.length - 1); // Reverse the whole Array
        // {4,3,2,1,0}

        reverse(nums, 0, k - 1); // Reverse first part (4,3 -> 3,4)
        // {3,4,2,1,0}

        reverse(nums, k, nums.length - 1); //Reverse second part (2,1,0 -> 0,1,2)
        // {3,4,0,1,2}
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        new Solution().rotate(nums, k);
        for (int n : nums)
            System.out.println(n);
    }
}
