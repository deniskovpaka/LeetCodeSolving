package medium.DeleteNodesAndReturnForest;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node3 = new TreeNode(3, node6, node7);
        TreeNode node1 = new TreeNode(1, node2, node3);
        Solution solution = new Solution();
        int[] to_delete = new int[] {3, 5};
        List<TreeNode> res = solution.delNodes(node1, to_delete);
        System.out.println("");
    }
}
