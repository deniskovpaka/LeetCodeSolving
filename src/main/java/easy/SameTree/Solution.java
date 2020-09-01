package easy.SameTree;

import easy.FindModeInBinarySearchTree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    private List<Integer> pNodeValue = new LinkedList<>();
    private List<Integer> qNodeValue = new LinkedList<>();

    public boolean isSameTree(TreeNode p, TreeNode q) {
        traverseNode(p, pNodeValue);
        traverseNode(q, qNodeValue);
        return pNodeValue.equals(qNodeValue);
    }

    private void traverseNode(TreeNode node, List<Integer> nodeValues) {
        if (node == null) {
            nodeValues.add(Integer.MIN_VALUE);
            return;
        }
        nodeValues.add(node.val);
        traverseNode(node.left, nodeValues);
        traverseNode(node.right, nodeValues);
    }

    public static void main(String[] args) {
//        TreeNode node2 = new TreeNode(2);
//        TreeNode node3 = new TreeNode(3);
//        TreeNode node1 = new TreeNode(1, node2, node3);
//
//        TreeNode node22 = new TreeNode(2);
//        TreeNode node33 = new TreeNode(3);
//        TreeNode node11 = new TreeNode(1, node22, node33);
//
//        TreeNode node2 = new TreeNode(2);
//        TreeNode node1 = new TreeNode(1, node2, null);
//
//        TreeNode node22 = new TreeNode(2);
//        TreeNode node11 = new TreeNode(1, null, node22);

        TreeNode node2 = new TreeNode(2);
        TreeNode node11 = new TreeNode(1);
        TreeNode node1 = new TreeNode(1, node2, node11);

        TreeNode node1111 = new TreeNode(1);
        TreeNode node22 = new TreeNode(2);
        TreeNode node111 = new TreeNode(1, node1111, node22);

        boolean isSameTree = new Solution().isSameTree(node1, node11);
        System.out.println("Res = " + isSameTree);
    }
}
