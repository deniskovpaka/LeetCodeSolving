package medium.ConvertSortedListToBinarySearchTree;

import easy.ConvertSortedArrayToBinarySearchTree.TreeNode;
import easy.IntersectionOfTwoLinkedLists.ListNode;

public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        return sort(head, null);
    }

    private TreeNode sort(ListNode head, ListNode tail) {
        if (head == tail) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != tail && fast.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = sort(head, slow);
        root.right = sort(slow.next, tail);
        return root;
    }
}
