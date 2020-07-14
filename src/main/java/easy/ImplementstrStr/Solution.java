package easy.ImplementstrStr;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length() - needle.length() + 1; ++i) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "aaaaa", needle = "bba";
        int res = new Solution().strStr(haystack, needle);
        System.out.println("Res = " + res);
    }
}
