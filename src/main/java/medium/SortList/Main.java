package medium.SortList;

public class Main {
    public static void main(String[] args) {
        ListNode three = new ListNode(3);
        ListNode one = new ListNode(1, three);
        ListNode two = new ListNode(2, one);
        ListNode four = new ListNode(4, two);
        Solution solution = new Solution();
        ListNode res = solution.sortList(four);
        System.out.println("+");
    }
}
