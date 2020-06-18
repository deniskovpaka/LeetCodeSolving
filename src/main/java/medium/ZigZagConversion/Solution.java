package medium.ZigZagConversion;

public class Solution {
    public String convert(String s, int numRows) {
        int strLength = s.length();
        if (strLength < 2) {
            return s;
        }

        StringBuilder[] builder = new StringBuilder[numRows];
        for (int i = 0; i < numRows; ++i) {
            builder[i] = new StringBuilder();
        }

        for (int i = 0; i < strLength; ) {
            for (int j = 0; j < numRows && i < strLength; ++j) {
                builder[j].append(s.charAt(i++));
            }

            for (int k = 0; k < numRows - 2 && i < strLength; ++k) {
                builder[numRows - k - 2].append(s.charAt(i++));
            }
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; ++i) {
            res.append(builder[i].toString());
        }
        return res.toString();
    }
}
