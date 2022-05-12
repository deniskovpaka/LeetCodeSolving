package medium.RecoverBinarySearchTree;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

public class Solution {
    private TreeNode prev;
    private TreeNode first;
    private TreeNode second;

    public void recoverTree(TreeNode root) {
        recover(root);
        if (first != null && second != null) {
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }
    }

    private void recover(TreeNode current) {
        if (current == null) {
            return;
        }
        recover(current.left);
        if (prev != null && prev.val > current.val) {
            if (first == null) {
                first = prev;
            }
            second = current;
        }
        prev = current;
        recover(current.right);
    }
}
