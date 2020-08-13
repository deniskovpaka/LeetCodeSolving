package easy.SumOfLeftLeaves;

import easy.FindModeInBinarySearchTree.TreeNode;

public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sum = 0;
        if(root.left !=null && root.left.left == null && root.left.right == null) {
            sum = root.left.val;
        }
        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);
        return sum;
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
        int res = new Solution().sumOfLeftLeaves(t1);
        System.out.println("Res = " + res);
    }
}
