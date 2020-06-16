package medium.AddTwoNumbers;

public class Solution {
    private int tenth;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return reverseListNode(addTwoLists(l1, l2));
    }

    private ListNode reverseListNode(ListNode node) {
        ListNode reverseList = null;
        while (node != null) {
            ListNode tempNode = new ListNode(node.val, reverseList);
            reverseList = tempNode;
            node = node.next;
        }
        return reverseList;
    }

    private ListNode addTwoLists(ListNode first, ListNode second) {
        ListNode res = null;
        while (first != null || second != null || tenth > 0) {
            int v1 = (first != null) ? first.val : 0;
            int v2 = (second != null) ? second.val : 0;

            int sum = v1 + v2 + tenth;
            tenth = 0;
            if (sum >= 10) {
                sum = sum % 10;
                tenth = 1;
            }
            ListNode temp = new ListNode(sum, res);
            res = temp;

            if (first != null) {
                first = first.next;
            }
            if (second != null) {
                second = second.next;
            }
        }
        return res;
    }
}
