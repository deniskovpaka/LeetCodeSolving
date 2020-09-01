package easy.PathSum;

import easy.FindModeInBinarySearchTree.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null && root.val == sum) return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    //      5
    //     / \
    //    4   8
    //   /   / \
    //  11  13  4
    // /  \      \
    //7    2      1
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node4 = new TreeNode(4, null, node1);
        TreeNode node13 = new TreeNode(13);
        TreeNode node8 = new TreeNode(8, node13, node4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node7 = new TreeNode(7);
        TreeNode node11 = new TreeNode(11, node7, node2);
        TreeNode node44 = new TreeNode(4, node11, null);
        TreeNode node5 = new TreeNode(5, node44, node8);
        boolean hasPathSum = new Solution().hasPathSum(node5, 22);

//        TreeNode node8 = new TreeNode(8);
//        TreeNode node11 = new TreeNode(11);
//        TreeNode node44 = new TreeNode(4, node11, null);
//        TreeNode node5 = new TreeNode(5, node44, node8);
//        boolean hasPathSum = new Solution().hasPathSum(node5, 20);
        System.out.println("Res = " + hasPathSum);
    }
}
