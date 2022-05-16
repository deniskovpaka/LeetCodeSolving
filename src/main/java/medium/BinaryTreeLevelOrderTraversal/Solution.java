package medium.BinaryTreeLevelOrderTraversal;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            int currentLevel = nodes.size();
            List<Integer> levelResult = new ArrayList<>();
            for (int i = 0; i < currentLevel; ++i) {
                TreeNode currentNode = nodes.poll();
                if (currentNode.left != null) {
                    nodes.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    nodes.add(currentNode.right);
                }
                levelResult.add(currentNode.val);
            }
            result.add(levelResult);
        }
        return result;
    }
}
