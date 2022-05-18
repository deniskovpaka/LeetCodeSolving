package medium.DeleteNodesAndReturnForest;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

import java.util.*;

public class Solution {
    private List<TreeNode> res = new ArrayList<>();
    private Set<Integer> needToDelete = new HashSet<>();

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for (int value : to_delete) {
            needToDelete.add(value);
        }

        TreeNode node = delete(root);
        if (node != null) {
            res.add(root);
        }
        return res;
    }

    private TreeNode delete(TreeNode node) {
        if (node == null) {
            return null;
        }

        node.left = delete(node.left);
        node.right = delete(node.right);
        if (needToDelete.contains(node.val)) {
            if (node.left != null) {
                res.add(node.left);
            }
            if (node.right != null) {
                res.add(node.right);
            }
            return null;
        }
        return node;
    }
}
