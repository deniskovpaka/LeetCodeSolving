package medium.SortList;

public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode middle = middle(head);
        ListNode left = sortList(head);
        ListNode right = sortList(middle);
        return merge(left, right);
    }

    private ListNode merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        tail.next = (list1 != null) ? list1 : list2;
        return head.next;
    }

    private ListNode middle(ListNode head) {
        ListNode slowPointer = null;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = (slowPointer == null) ? head : slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        ListNode mid = slowPointer.next;
        slowPointer.next = null;
        return mid;
    }
}
