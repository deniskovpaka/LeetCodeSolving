package medium.LetterCombinationOfPhoneNumber;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String digits = "";
        List<String> combinations = solution.letterCombinations(digits);
        System.out.println(combinations);
    }
}
