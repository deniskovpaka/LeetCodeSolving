package easy.RemoveDuplicatesFromSortedList;

import medium.AddTwoNumbers.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode firstNode = head;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return firstNode;
    }

    public static void main(String[] args) {
        ListNode node3 = new ListNode(3);
        ListNode node33 = new ListNode(3, node3);
        ListNode node2 = new ListNode(2, node33);
        //ListNode node111 = new ListNode(1);
        ListNode node11 = new ListNode(1, node2);
        ListNode node1 = new ListNode(1, node11);

        ListNode res = new Solution().deleteDuplicates(node1);
        System.out.println("Res = " + res);
    }
}
