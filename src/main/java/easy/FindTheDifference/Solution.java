package easy.FindTheDifference;

public class Solution {
    public char findTheDifference(String s, String t) {
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            chars[s.charAt(i) - 'a'] += 1;
            chars[t.charAt(i) - 'a'] -= 1;
        }
        chars[t.charAt(t.length() - 1) - 'a'] -= 1;

        char res = 'a';
        for (int i = 0; i < chars.length; ++i) {
            if (chars[i] == -1) {
                res = (char) (i + 97);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "azbc";
        String t = "abcze";
        char diff = new Solution().findTheDifference(s, t);
        System.out.println("Res = " + diff);
    }
}
