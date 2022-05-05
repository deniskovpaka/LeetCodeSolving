package medium.ThreeSum;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Set<List<Integer>> setRes = new HashSet<>();
        for (int i = 0; i < nums.length - 2; ++i) {
            int low = i + 1;
            int up = nums.length - 1;
            while (low < up) {
                if (nums[i] + nums[low] + nums[up] == 0) {
                    setRes.add(List.of(nums[i], nums[low], nums[up]));
                    while (low < up && nums[low] == nums[low + 1]) ++low;
                    while (low < up && nums[up] == nums[up - 1]) --up;
                    ++low;
                } else if (nums[i] + nums[low] + nums[up] > 0) {
                    --up;
                } else {
                    ++low;
                }
            }
        }

        return new ArrayList<>(setRes);
    }
}
