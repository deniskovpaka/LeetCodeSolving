package easy.ReverseLinkedList;

import medium.AddTwoNumbers.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode currentHead = null;
        while (head != null) {
            currentHead = new ListNode(head.val, currentHead);
            head = head.next;
        }
        return currentHead;
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode res = new Solution().reverseList(node1);
        System.out.println("Res = " + res);
    }
}

