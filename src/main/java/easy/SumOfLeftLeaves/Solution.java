package easy.SumOfLeftLeaves;

import easy.FindModeInBinarySearchTree.TreeNode;

public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum = root.left.val;
        }
        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        //Initialize an arrays to store the money
        int[] mark = new int[nums.length];

        //We can infer the formula from problem:mark[i]=max(num[i]+mark[i-2],mark[i-1])
        //so initialize two nums at first.
        mark[0] = nums[0];
        mark[1] = Math.max(nums[0], nums[1]);

        //Using Dynamic Programming to mark the max money in loop.
        for (int i = 2; i < nums.length; i++) {
            int a = nums[i] + mark[i - 2];
            int b = mark[i - 1];
            mark[i] = Math.max(a, b);
        }
        return mark[nums.length - 1];
    }

    public static void main(String[] args) {
//        TreeNode t15 = new TreeNode(15);
//        TreeNode t7 = new TreeNode(7);
//        TreeNode t20 = new TreeNode(20, t15, t7);
//        TreeNode t9 = new TreeNode(9);
//        TreeNode t3 = new TreeNode(3, t9, t20);

        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t2 = new TreeNode(2, t4, t5);
        TreeNode t3 = new TreeNode(3);
        TreeNode t1 = new TreeNode(1, t2, t3);
        //int res = new Solution().sumOfLeftLeaves(t1);
        int[] nums = {2, 1, 1, 8, 3, 10};
        new Solution().rob(nums);
        //System.out.println("Res = " + res);
    }
}
