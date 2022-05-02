package interview;

import medium.AddTwoNumbers.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode four = new ListNode(4);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(1, two);
        ListNode res = reverse(one);
    }

    private static ListNode reverse(ListNode head) {
        ListNode reverseHead = null;
        ListNode current = head;
        while (current != null) {
            ListNode second = current.next;
            current.next = reverseHead;
            reverseHead = current;
            current = second;
        }
        return reverseHead;
    }
}
