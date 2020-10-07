package easy.RemoveElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int notRemovedElementPos = findLastNotRemovedElementPos(nums, nums.length - 1, val);
        for (int i = 0; i < notRemovedElementPos; ++i) {
            if (nums[i] == val) {
                nums[i] = nums[notRemovedElementPos];
                notRemovedElementPos = findLastNotRemovedElementPos(nums, notRemovedElementPos - 1, val);
            }
        }

        return notRemovedElementPos + 1;
    }

    private int findLastNotRemovedElementPos(int[] nums, int i, int val) {
        while (i >= 0 && nums[i] == val) {
            --i;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println("Res = " + new Solution().removeElement(nums, val));
    }
}
