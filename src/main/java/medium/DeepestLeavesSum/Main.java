package medium.DeepestLeavesSum;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7);
        TreeNode node4 = new TreeNode(4, node7, null);
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node8 = new TreeNode(8);
        TreeNode node6 = new TreeNode(6, null, node8);
        TreeNode node3 = new TreeNode(3, null, node6);
        TreeNode node1 = new TreeNode(1, node2, node3);
        Solution solution = new Solution();
        System.out.println(solution.deepestLeavesSum(node1));
    }
}
