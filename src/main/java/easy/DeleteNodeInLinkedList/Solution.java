package easy.DeleteNodeInLinkedList;

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next =  node.next.next;
    }

    public static void main(String[] args) {
        // 4,5,1,9
        ListNode node9 = new ListNode(9);
        ListNode node1 = new ListNode(1);
        node1.next = node9;
        ListNode node5 = new ListNode(5);
        node5.next = node1;
        ListNode node4 = new ListNode(4);
        node4.next = node5;

        new Solution().deleteNode(node5);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}