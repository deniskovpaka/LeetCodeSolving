package easy.RootEqualsSumOfChildren;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

public class Solution {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
