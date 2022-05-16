package medium.DeepestLeavesSum;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

import java.util.*;

public class Solution {
    private Map<Integer, List<Integer>> deepestValues = new TreeMap<>();
    public int deepestLeavesSum(TreeNode root) {
        traverse(root, 0);
        List<Integer> previousLevel = new ArrayList<>();

        List<Integer> lastLevel = deepestValues.get(deepestValues.size());
        Collections.reverse(lastLevel);

        return lastLevel.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    private void traverse(TreeNode root, int currentLevel) {
        if (root == null) {
            return;
        }
        traverse(root.left, currentLevel + 1);
        traverse(root.right, currentLevel + 1);
        deepestValues.merge(currentLevel + 1, List.of(root.val), (v1, v2) -> {
            List<Integer> l1 = new ArrayList<>();
            l1.addAll(v1);
            l1.addAll(v2);
            return l1;
        });
    }
}
