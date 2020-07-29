package easy.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Character, Integer> romanValues = new HashMap<>();

    public Solution() {
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
    }

    // I can be placed before V (5) and X (10) to make 4 and 9.
    // X can be placed before L (50) and C (100) to make 40 and 90.
    // C can be placed before D (500) and M (1000) to make 400 and 900.
    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); ++i) {
            char currentRomanChar = s.charAt(i);
            boolean hasNextRomanChar = i + 1 < s.length();
            if (currentRomanChar == 'I' && hasNextRomanChar && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                res += romanValues.get(s.charAt(i + 1)) - 1;
                ++i;
            } else if (currentRomanChar == 'X' && hasNextRomanChar && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                res += romanValues.get(s.charAt(i + 1)) - 10;
                ++i;
            } else if (currentRomanChar == 'C' && hasNextRomanChar && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                res += romanValues.get(s.charAt(i + 1)) - 100;
                ++i;
            } else {
                res += romanValues.get(currentRomanChar);
            }
        }

        return res;
    }

    public static void main(String[] args) {
//        String s = "III"; // 3
//        String s = "IV"; // 4
//        String s = "IX"; // 9
//        String s = "LVIII"; // 58
        String s = "MCMXCIV"; // 1994
        int res = new Solution().romanToInt(s);
        System.out.println("Res = " + res);
    }
}
