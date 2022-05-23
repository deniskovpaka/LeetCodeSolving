package medium.SumOfNodesWithEvenValuedGrandparent;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode2 = new TreeNode(2, treeNode9, null);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(7, treeNode1, treeNode4);
        TreeNode treeNode77 = new TreeNode(7, treeNode2, treeNode7);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(3, null, treeNode5);
        TreeNode treeNode11 = new TreeNode(1);
        TreeNode treeNode8 = new TreeNode(8, treeNode11, treeNode3);
        TreeNode treeNode6 = new TreeNode(6, treeNode77, treeNode8);
        Solution solution = new Solution();
        System.out.println(solution.sumEvenGrandparent(treeNode6));
    }
}
