package easy.MergeTwoSortedLists;

import medium.AddTwoNumbers.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode head = res;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                res.next = l1;
                res = res.next;
                l1 = l1.next;
            } else {
                res.next = l2;
                res = res.next;
                l2 = l2.next;
            }
        }

        while (l1 != null) {
            res.next = l1;
            res = res.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            res.next = l2;
            res = res.next;
            l2 = l2.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        // Input: 1->2->4, 1->3->4
        // Output: 1->1->2->3->4->4
        ListNode node4 = new ListNode(4);
        ListNode node2 = new ListNode(2, node4);
        ListNode node1 = new ListNode(1, node2);

        ListNode node44 = new ListNode(4);
        ListNode node33 = new ListNode(3, node44);
        ListNode node11 = new ListNode(1, node33);

        ListNode res = new Solution().mergeTwoLists(node1, node11);
    }
}
