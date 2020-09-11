package easy.ValidPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        String newS = s.toLowerCase()
                .replaceAll("[^a-z0-9]", "");
        for (int i = 0; i < newS.length() / 2; ++i) {
            if (newS.charAt(i) != newS.charAt(newS.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "race a car";
        System.out.println("Res is = " + new Solution().isPalindrome(s));
    }
}
