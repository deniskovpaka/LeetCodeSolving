package medium.LetterCombinationOfPhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isBlank()) {
            return new ArrayList<>();
        }
        String[] phoneNumbers = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res = new ArrayList<>();
        backtrack(phoneNumbers, digits.toCharArray(), "", res);
        return res;
    }

    private void backtrack(String[] phoneNumbers, char[] digits, String s, List<String> res) {
        if (s.length() == digits.length) {
            res.add(s);
            return;
        }
        int i = s.length();
        int digit = digits[i] - '0';
        for (char letter : phoneNumbers[digit].toCharArray()) {
            backtrack(phoneNumbers, digits, s + letter, res);
        }
    }
}