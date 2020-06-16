package medium.AddTwoNumbers;

//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
//        Explanation: 342 + 465 = 807.
public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(9, l1);
        ListNode l3 = new ListNode(9, l2);

        ListNode l4 = new ListNode(9, l3);
        ListNode l5 = new ListNode(9, l4);
        ListNode l6 = new ListNode(9, l5);

        ListNode l7 = new ListNode(9, l6);
        ListNode l8 = new ListNode(9, l7);
        ListNode l9 = new ListNode(9, l8);
        ListNode l10 = new ListNode(1, l9);


        ListNode l11 = new ListNode(9);

        ListNode res = new Solution().addTwoNumbers(l11, l10);

//        ListNode l11 = new ListNode(7);
//        ListNode l12 = new ListNode(8, l11);
//        ListNode l13 = new ListNode(1, l12);
//        ListNode l14 = new ListNode(0);
//
//        ListNode res = new Solution().addTwoNumbers(l14, l13);

    }
}
