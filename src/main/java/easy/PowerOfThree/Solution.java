package easy.PowerOfThree;

public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        int n = 45;
        boolean isPower = new Solution().isPowerOfThree(n);
        System.out.println("Res = " + isPower);
    }
}
