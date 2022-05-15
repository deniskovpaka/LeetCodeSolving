package easy.MinimumAbsoluteDifferenceInBST;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<Integer> arr = new ArrayList<>();

    public int getMinimumDifference(TreeNode root) {
        visitEveryNode(root);
        arr.sort(Integer::compareTo);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.size() - 1; ++i) {
            if (arr.get(i + 1) - arr.get(i) < min) {
                min = arr.get(i + 1) - arr.get(i);
            }
        }
        return min;
    }

    private void visitEveryNode(TreeNode root) {
        if (root == null) {
            return;
        }
        arr.add(root.val);
        visitEveryNode(root.left);
        visitEveryNode(root.right);
    }
}
