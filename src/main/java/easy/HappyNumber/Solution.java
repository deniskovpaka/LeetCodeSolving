package easy.HappyNumber;

public class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);

        while(fast != 1 && fast != slow) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }

        return fast == 1;
    }
    private int getNext(int n) {
        int ans = 0;
        while(n > 0) {
            int digit = n%10;
            ans += digit*digit;
            n/=10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        boolean isHappy = new Solution().isHappy(n);
        System.out.println("Res = " + isHappy);
    }
}
