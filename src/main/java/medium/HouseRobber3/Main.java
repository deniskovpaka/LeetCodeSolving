package medium.HouseRobber3;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode node33 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, null, node33);
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3, null, node1);
        TreeNode node333 = new TreeNode(3, node2, node3);
        Solution solution = new Solution();
        System.out.println(solution.rob(node333));
    }
}
