package easy.LongestCommonPrefix;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
//    public String longestCommonPrefix(String[] strs) {
//        if (strs.length == 0) {
//            return "";
//        }
//        Arrays.sort(strs, Comparator.comparingInt(String::length));
//        String smallestStr = strs[0];
//        int currentPos = smallestStr.length();
//        for (int i = 0; i < strs.length; ++i) {
//            if (!strs[i].substring(0, currentPos).equals(smallestStr.substring(0, currentPos))) {
//                --currentPos;
//                i = -1;
//            }
//        }
//        return smallestStr.substring(0, currentPos);
//    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        return longestCommonPrefix(strs, 0, strs.length - 1);
    }

    private String longestCommonPrefix(String[] strs, int l, int r) {
        if (l == r) {
            return strs[l];
        } else {
            int mid = (l + r) / 2;
            String lcpLeft = longestCommonPrefix(strs, l, mid);
            String lcpRight = longestCommonPrefix(strs, mid + 1, r);
            return commonPrefix(lcpLeft, lcpRight);
        }
    }

    String commonPrefix(String left, String right) {
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i))
                return left.substring(0, i);
        }
        return left.substring(0, min);
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Res = " + new Solution().longestCommonPrefix(strs));
    }
}
