package easy.BalancedBinaryTree;

import easy.FindModeInBinarySearchTree.TreeNode;

public class Solution {
    private boolean result = true;

    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return result;
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if (Math.abs(l - r) > 1)
            result = false;
        return 1 + Math.max(l, r);
    }

    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(4);
        TreeNode node44 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3, node4, node44);
        TreeNode node33 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node3, node33);
        TreeNode node22 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1, node2, node22);
        boolean isBalanced = new Solution().isBalanced(node1);
        System.out.println("Res = " + isBalanced);
    }
}
