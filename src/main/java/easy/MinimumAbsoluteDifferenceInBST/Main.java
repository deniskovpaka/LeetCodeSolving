package easy.MinimumAbsoluteDifferenceInBST;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode node699 = new TreeNode(699);
        TreeNode node652 = new TreeNode(652, null, node699);
        TreeNode node445 = new TreeNode(445);
        TreeNode node384 = new TreeNode(384, null, node445);
        TreeNode node543 = new TreeNode(543, node384,  node652);
        Solution sol = new Solution();
        System.out.println(sol.getMinimumDifference(node543));
    }
}
