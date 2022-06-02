package medium.MaximumTwinSumOfALinkedList;

import easy.IntersectionOfTwoLinkedLists.ListNode;

public class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (slow.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode current = slow.next;
        slow.next = null;
        ListNode reverseHead = null;
        ListNode previous = null;
        while (current != null) {
            previous = reverseHead;
            reverseHead = current;
            current = current.next;
            reverseHead.next = previous;
        }
        int maxPairSum = 0;
        while (head != null) {
            if (head.val + reverseHead.val > maxPairSum) {
                maxPairSum = head.val + reverseHead.val;
            }
            head = head.next;
            reverseHead = reverseHead.next;
        }
        return maxPairSum;
    }
}
