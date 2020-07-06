package easy.SymmetricTree;

import easy.FindModeInBinarySearchTree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    private List<Integer> leftValues = new LinkedList<>();
    private List<Integer> rightValues = new LinkedList<>();

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        TreeNode leftNodes = new TreeNode(root.val, root.left, null);
        TreeNode rightNodes = new TreeNode(root.val, null, root.right);

        traverseLeftNodes(leftNodes);
        traverseRightNodes(rightNodes);
        return leftValues.equals(rightValues);
    }

    private void traverseLeftNodes(TreeNode leftNodes) {
        if (leftNodes != null) {
            leftValues.add(leftNodes.val);
            traverseLeftNodes(leftNodes.left);
            traverseLeftNodes(leftNodes.right);
        } else {
            leftValues.add(Integer.MIN_VALUE);
        }
    }

    private void traverseRightNodes(TreeNode rightNodes) {
        if (rightNodes != null) {
            rightValues.add(rightNodes.val);
            traverseRightNodes(rightNodes.right);
            traverseRightNodes(rightNodes.left);
        } else {
            rightValues.add(Integer.MIN_VALUE);
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode3 = new TreeNode(3, treeNode5, treeNode6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);
        TreeNode treeNode4 = new TreeNode(4, treeNode7, treeNode8);
        TreeNode treeNode2 = new TreeNode(2, treeNode3, treeNode4);

        TreeNode treeNode5_5 = new TreeNode(5);
        TreeNode treeNode6_6 = new TreeNode(6);
        TreeNode treeNode3_3 = new TreeNode(3, treeNode6_6, treeNode5_5);
        TreeNode treeNode7_7 = new TreeNode(7);
        TreeNode treeNode8_8 = new TreeNode(8);
        TreeNode treeNode4_4 = new TreeNode(4, treeNode8_8, treeNode7_7);
        TreeNode treeNode2_2 = new TreeNode(2, treeNode4_4, treeNode3_3);

//        TreeNode treeNode3 = new TreeNode(3);
//        TreeNode treeNode2 = new TreeNode(2, null, treeNode3);
//        TreeNode treeNode3_3 = new TreeNode(3);
//        TreeNode treeNode2_2 = new TreeNode(2, null, treeNode3_3);
        TreeNode treeNode1 = new TreeNode(1, treeNode2, treeNode2_2);
        System.out.println("Is symmetric: " + new Solution().isSymmetric(treeNode1));
    }
}
