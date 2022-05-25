package medium.EvenOddTree;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode treeNode12 = new TreeNode(12);
        TreeNode treeNode8 = new TreeNode(8);
        TreeNode treeNode3 = new TreeNode(3, treeNode12, treeNode8);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7, treeNode6, null);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode9 = new TreeNode(9, null, treeNode2);
        TreeNode treeNode4 = new TreeNode(4, treeNode7, treeNode9);
        TreeNode treeNode10 = new TreeNode(10, treeNode3, null);
        TreeNode treeNode1 = new TreeNode(1, treeNode10, treeNode4);

//        TreeNode treeNode3 = new TreeNode(3);
//        TreeNode treeNode5 = new TreeNode(5);
//        TreeNode treeNode9 = new TreeNode(9, treeNode3, treeNode5);
//        TreeNode treeNode7 = new TreeNode(7);
//        TreeNode treeNode1 = new TreeNode(1, treeNode7, null);
//        TreeNode treeNode55 = new TreeNode(5, treeNode9, treeNode1);

        Solution solution = new Solution();
//        System.out.println(solution.isEvenOddTree(treeNode55));
        System.out.println(solution.isEvenOddTree(treeNode1));
    }
}
