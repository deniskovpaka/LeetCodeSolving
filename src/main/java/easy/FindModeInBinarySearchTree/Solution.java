package easy.FindModeInBinarySearchTree;

import java.util.*;

public class Solution {
    private Map<Integer, Integer> modes = new HashMap<>();

    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }
        traverseNodes(root);

        final int maxValue = modes.values().stream()
                .max(Integer::compareTo)
                .orElse(0);

        List<Integer> values = new ArrayList<>();
        modes.forEach((key, value) -> {
            if (value == maxValue) {
                values.add(key);
            }
        });

        return values.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private void traverseNodes(TreeNode root) {
        if (root == null) {
            return;
        }
        modes.merge(root.val, 1, Integer::sum);
        traverseNodes(root.left);
        traverseNodes(root.right);
    }

    public static void main(String[] args) {
        TreeNode t3 = new TreeNode(2);
        TreeNode t2 = new TreeNode(2, t3, null);
        TreeNode t1 = new TreeNode(1, null, t2);

        int[] res = new Solution().findMode(t1);
        for (int re : res) {
            System.out.println(re + " ");
        }
    }
}
