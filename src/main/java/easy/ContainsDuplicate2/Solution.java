package easy.ContainsDuplicate2;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numsPosition = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (!numsPosition.containsKey(nums[i])) {
                numsPosition.put(nums[i], i);
            } else {
                Integer currentPos = numsPosition.get(nums[i]);
                if (i - currentPos <= k) {
                    return true;
                } else {
                    numsPosition.put(nums[i], i);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        System.out.println("Res = " + new Solution().containsNearbyDuplicate(nums, k));
    }
}
