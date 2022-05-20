package easy.RangeSumOfBST;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3);
        TreeNode node7 = new TreeNode(7);
        TreeNode node5 = new TreeNode(5, node3, node7);
        TreeNode node18 = new TreeNode(18);
        TreeNode node15 = new TreeNode(15, null, node18);
        TreeNode node10 = new TreeNode(10, node5, node15);
        Solution solution = new Solution();
        System.out.println(solution.rangeSumBST(node10, 7, 15));
    }
}
