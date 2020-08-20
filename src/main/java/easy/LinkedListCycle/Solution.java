package easy.LinkedListCycle;

import medium.AddTwoNumbers.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slowPoiner = head;
        ListNode fastPoiner = head;
        while (slowPoiner != null && fastPoiner.next != null) {
            slowPoiner = slowPoiner.next;
            fastPoiner = fastPoiner.next.next;
            if (fastPoiner == null) {
                break;
            } else if (slowPoiner == fastPoiner) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // head = [3,2,0,-4], pos = 1
        ListNode node4 = new ListNode(-4);
        ListNode node0 = new ListNode(0, node4);
        ListNode node2 = new ListNode(2, node0);
        node4.next = node2;
        ListNode node3 = new ListNode(3, node2);

//        boolean hasCycle = new Solution().hasCycle(node3);
        ListNode node22 = new ListNode(2);
        ListNode node11 = new ListNode(1, node22);
        node22.next = node11;
        boolean hasCycle = new Solution().hasCycle(node11);
        System.out.println("Res = " + hasCycle);
    }
}
