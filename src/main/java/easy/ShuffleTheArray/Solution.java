package easy.ShuffleTheArray;

import java.util.Arrays;

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffle = new int[nums.length];
        for (int i = 0, j = 0; i < n; ++i) {
            shuffle[j++] = nums[i];
            shuffle[j++] = nums[n + i];
        }
        return shuffle;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] res = new Solution().shuffle(nums, n);
        System.out.println(Arrays.toString(res));
    }
}
