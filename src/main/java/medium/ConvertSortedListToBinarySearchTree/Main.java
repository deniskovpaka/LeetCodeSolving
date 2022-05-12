package medium.ConvertSortedListToBinarySearchTree;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;
import easy.IntersectionOfTwoLinkedLists.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode node9 = new ListNode(9);
        ListNode node5 = new ListNode(5, node9);
        ListNode node0 = new ListNode(0, node5);
        ListNode nodeMinThree = new ListNode(-3, node0);
        ListNode nodeMinTen = new ListNode(-10, nodeMinThree);
        Solution solution = new Solution();
        TreeNode treeNode = solution.sortedListToBST(nodeMinTen);
        System.out.println("");
    }
}
