package medium.EvenOddTree;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean isEvenLevel = true;
        while (!queue.isEmpty()) {
            int currentLevelSize = queue.size();
            int previousValue = isEvenLevel ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for (int i = 0; i < currentLevelSize; ++i) {
                TreeNode currentNode = queue.poll();
                if (currentNode.left != null) queue.add(currentNode.left);
                if (currentNode.right != null) queue.add(currentNode.right);

                if (isEvenLevel) {
                    if (currentNode.val <= previousValue || currentNode.val % 2 != 1) {
                        return false;
                    }
                } else if (currentNode.val >= previousValue || currentNode.val % 2 != 0) {
                    return false;
                }
                previousValue = currentNode.val;
            }
            isEvenLevel = !isEvenLevel;
        }
        return true;
    }
}
