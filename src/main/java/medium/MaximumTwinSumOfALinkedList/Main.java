package medium.MaximumTwinSumOfALinkedList;

import easy.IntersectionOfTwoLinkedLists.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2, node1);
        ListNode node4 = new ListNode(4, node2);
        ListNode node5 = new ListNode(5, node4);
        Solution solution = new Solution();
        System.out.println(solution.pairSum(node5));
    }
}
