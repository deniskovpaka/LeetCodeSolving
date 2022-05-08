package medium.FourSum;

import java.util.*;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < nums.length - 3; ++i) {
            for (int j = i + 1; j < nums.length - 2; ++j) {
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int currentSum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (currentSum == target) {
                        res.add(List.of(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) ++left;
                        while (left < right && nums[right] == nums[right - 1]) --right;
                        ++left;
                    } else if (currentSum > target) {
                        --right;
                    } else {
                        ++left;
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}
