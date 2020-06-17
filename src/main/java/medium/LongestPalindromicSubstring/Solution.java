package medium.LongestPalindromicSubstring;

public class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) {
            return s;
        }

        int maxPalindromeLength = 1;
        int startPos = 0;

        boolean[][] table = new boolean[n][n];
        // Fill table [i][j] to be true
        for (int i = 0; i < n; ++i) {
            table[i][i] = true;
        }

        // Find pairs in table
        for (int i = 0; i < n - 1; ++i) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                table[i][i + 1] = true;
                maxPalindromeLength = 2;
                startPos = i;
            }
        }

        // Find palindromic bigger then maxPalindromeLength
        for (int k = 3; k <= n; ++k) {
            for (int i = 0; i < n - k + 1; ++i) {
                // Find new startPos
                int j = i + k - 1;
                if (table[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    table[i][j] = true;
                    if (k > maxPalindromeLength) {
                        maxPalindromeLength = k;
                        startPos = i;
                    }
                }
            }
        }

        return s.substring(startPos, startPos + maxPalindromeLength);
    }
}
