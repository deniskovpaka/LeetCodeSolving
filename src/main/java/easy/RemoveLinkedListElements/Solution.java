package easy.RemoveLinkedListElements;

import medium.AddTwoNumbers.ListNode;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = new ListNode(Integer.MIN_VALUE, head);
        ListNode ret = prev;
        while (head != null) {
            if (head.val == val) {
                head = head.next;
                prev.next = head;
                continue;
            }
            prev = head;
            head = head.next;
        }
        return ret.next;
    }

    public static void main(String[] args) {
        // 1->2->6->3->4->5->6, val = 6
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node66 = new ListNode(6, node3);
        ListNode node2 = new ListNode(2, node66);
        ListNode node1 = new ListNode(1, node2);
        ListNode res = new Solution().removeElements(node1, 6);
    }
}
