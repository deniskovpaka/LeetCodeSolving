package medium.BinaryTreeLevelOrderTraversal;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7);
        TreeNode node15 = new TreeNode(15);
        TreeNode node20 = new TreeNode(20, node15, node7);
        TreeNode node9 = new TreeNode(9);
        TreeNode node3 = new TreeNode(3, node9, node20);
        Solution solution = new Solution();
        System.out.println(solution.levelOrder(node3));
    }
}
