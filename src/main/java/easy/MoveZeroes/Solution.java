package easy.MoveZeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        int zeroPointer = findZeroPointer(nums, 0);
        int valPointer = findValuePointer(nums, Math.max(zeroPointer, 0));
        while (valPointer != -1 && zeroPointer != -1) {
            if (valPointer > zeroPointer) {
                nums[zeroPointer] = nums[valPointer];
                nums[valPointer] = 0;
            }
            zeroPointer = findZeroPointer(nums, zeroPointer);
            valPointer = findValuePointer(nums, zeroPointer);
        }

//        for (int i = 0, j = 0; i < nums.length; ++i) {
//            if (nums[i] != 0 && i >= j) {
//                for (; j < nums.length; ++j) {
//                    if (nums[j] == 0) {
//                        nums[j] = nums[i];
//                        nums[i] = 0;
//                        i = j;
//                        break;
//                    }
//                }
//            }
//        }
        for (int i : nums) {
            System.out.println(i);
        }
    }

    private int findValuePointer(int[] array, int currentPos) {
        for (int i = currentPos; i < array.length; ++i) {
            if (array[i] != 0) {
                return i;
            }
        }
        return -1;
    }

    private int findZeroPointer(int[] array, int currentPos) {
        for (int i = currentPos; i < array.length; ++i) {
            if (array[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] nums = {0, 1, 0, 3, 12};
        int[] nums = {1, 2};
//        int[] nums = {4, 2, 4, 0, 0, 3, 0, 5, 1, 0}; // [4,2,4,3,5,1,0,0,0,0]
        new Solution().moveZeroes(nums);
    }
}
