package easy.PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String value = Integer.toString(x);
        for (int i = 0; i < value.length() / 2; ++i) {
            if (value.charAt(i) != value.charAt(value.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 10;
        boolean isPalindrome = new Solution().isPalindrome(x);
        System.out.println("Res = " + isPalindrome);
    }
}
