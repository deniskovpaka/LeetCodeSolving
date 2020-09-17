package easy.TwoSum2;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; ++i) {
            int findValue = target - numbers[i];
            int findPos = binarySearch(numbers, findValue);
            if (findPos != -1) {
                return new int[]{i + 1, (i == findPos) ? findPos + 2 : findPos + 1};
            }
        }
        return null;
    }

    public int binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 8, 11, 14};
        int target = 14;

        int res = new Solution().binarySearch(numbers, target);
        System.out.println("Res = " + res);
    }
}
