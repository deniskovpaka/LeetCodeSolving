package medium.HouseRobber3;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int rob(TreeNode root) {
        return robbing(root, new HashMap<>());
    }

    private int robbing(TreeNode node, Map<TreeNode, Integer> map) {
        if (node == null) {
            return 0;
        }
        if (map.containsKey(node)) {
            return map.get(node);
        }
        int robbed = 0;
        if (node.left != null) {
            robbed += robbing(node.left.left, map) + robbing(node.left.right, map);
        }
        if (node.right != null) {
            robbed += robbing(node.right.left, map) + robbing(node.right.right, map);
        }
        robbed = Math.max(node.val + robbed, robbing(node.left, map) + robbing(node.right, map));
        map.put(node, robbed);
        return robbed;
    }
}
