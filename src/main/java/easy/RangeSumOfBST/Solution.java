package easy.RangeSumOfBST;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

public class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return sumBST(root, low, high);
    }

    private int sumBST(TreeNode node, int low, int high) {
        if (node != null) {
            int sum = 0;
            sum += sumBST(node.left, low, high);
            if (node.val >= low && node.val <= high) {
                sum += node.val;
            }
            sum += sumBST(node.right, low, high);
            return sum;
        }
        return 0;
    }
}
