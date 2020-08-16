package easy.InvertBinaryTree;

import easy.FindModeInBinarySearchTree.TreeNode;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t3 = new TreeNode(3);
        TreeNode t2 = new TreeNode(2, t1, t3);
        TreeNode t6 = new TreeNode(6);
        TreeNode t9 = new TreeNode(9);
        TreeNode t7 = new TreeNode(7, t6, t9);
        TreeNode t4 = new TreeNode(4, t2, t7);

        TreeNode invert = new Solution().invertTree(t4);
        System.out.println("Res = " + invert);
    }
}
