package easy.ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (Integer v: nums) {
            if (numsSet.contains(v)) {
                return true;
            }
            numsSet.add(v);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean containsDup = new Solution().containsDuplicate(nums);
        System.out.println("Res = " + containsDup);
    }
}
