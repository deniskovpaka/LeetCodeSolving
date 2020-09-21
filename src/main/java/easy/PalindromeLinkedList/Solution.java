package easy.PalindromeLinkedList;

import medium.AddTwoNumbers.ListNode;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode newHead = null;
        ListNode pHead = head;
        while (pHead != null) {
            newHead = new ListNode(pHead.val, newHead);
            pHead = pHead.next;
        }
        while (head != null) {
            if (head.val != newHead.val) {
                return false;
            } else {
                head = head.next;
                newHead = newHead.next;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2, node1);
        ListNode node3 = new ListNode(3, node2);
        ListNode node22 = new ListNode(2, node3);
        ListNode node11 = new ListNode(1, node22);
        System.out.println("Res = " + new Solution().isPalindrome(node11));
    }
}
