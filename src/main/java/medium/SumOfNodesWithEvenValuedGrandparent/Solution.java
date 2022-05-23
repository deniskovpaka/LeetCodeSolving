package medium.SumOfNodesWithEvenValuedGrandparent;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private Queue<TreeNode> nodes = new LinkedList<>();
    public int sumEvenGrandparent(TreeNode root) {
        traverse(root);
        return nodes.stream()
                .mapToInt(node -> node.val)
                .sum();
    }

    private void traverse(TreeNode node) {
        if (node != null) {
            if (node.val % 2 == 0) {
                if (node.left != null) {
                    if (node.left.left != null) nodes.add(node.left.left);
                    if (node.left.right != null) nodes.add(node.left.right);
                }
                if (node.right != null) {
                    if (node.right.left != null) nodes.add(node.right.left);
                    if (node.right.right != null) nodes.add(node.right.right);
                }
            }
            traverse(node.left);
            traverse(node.right);
        }
    }
}
