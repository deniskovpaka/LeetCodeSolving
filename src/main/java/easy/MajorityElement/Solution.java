package easy.MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numsCount = new HashMap<>();
        for (int i : nums) {
            Integer currentValue = numsCount.getOrDefault(i, 0);
            numsCount.put(i, ++currentValue);
        }

        Map.Entry<Integer, Integer> maxEntry = numsCount.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();
        return maxEntry.getKey();
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 1, 1, 1, 2, 2};
        int majority = new Solution().majorityElement(nums);
        System.out.println("Res = " + majority);
    }
}
