package easy.IntersectionOfTwoLinkedLists;

public class Main {
    public static void main(String[] args) {
        ListNode c2 = new ListNode(2);
        ListNode c1 = new ListNode(1, c2);
        ListNode a2 = new ListNode(22, c1);
        ListNode a1 = new ListNode(11, a2);
        ListNode b3 = new ListNode(333, c1);
        ListNode b2 = new ListNode(222, b3);
        ListNode b1 = new ListNode(111, b2);
        Solution solution = new Solution();
        ListNode inter = solution.getIntersectionNode(a1, b1);
        System.out.println(inter.val);
    }
}
