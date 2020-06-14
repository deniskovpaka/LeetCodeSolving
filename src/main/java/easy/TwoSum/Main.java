package easy.TwoSum;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] {3, 2, 3};
        int target = 6;
        int[] res = new Solution().twoSum(nums, target);
        System.out.println(res[0] + ", " + res[1]);
    }
}
