package easy.IntersectionOfTwoLinkedLists;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode endB = headA;
        while (endB.next != null) {
            endB = endB.next;
        }
        endB.next = headB;
        ListNode intersection = null;
        ListNode slowPointer = headA;
        ListNode fastPointer = headA;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                slowPointer = headA;
                while (slowPointer != fastPointer) {
                    slowPointer = slowPointer.next;
                    fastPointer = fastPointer.next;
                }
                intersection = slowPointer;
                break;
            }
        }
        endB.next = null;
        return intersection;
    }
}
