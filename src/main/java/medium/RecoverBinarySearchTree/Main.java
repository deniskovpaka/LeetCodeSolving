package medium.RecoverBinarySearchTree;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4, node2, null);
        TreeNode node3 = new TreeNode(3, node1, node4);
        Solution solution = new Solution();
        solution.recoverTree(node3);
        System.out.println("");
    }
}
