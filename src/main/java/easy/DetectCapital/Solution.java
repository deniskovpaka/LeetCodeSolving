package easy.DetectCapital;

import static java.lang.Character.isUpperCase;

public class Solution {
    public boolean detectCapitalUse(String word) {
        if (isUpperCase(word.charAt(word.length() - 1))) {
            String upperCaseWord = word.toUpperCase();
            return upperCaseWord.equals(word);
        } else {
            String substringWord = word.substring(1);
            String lowerCaseSubstringWord = substringWord.toLowerCase();
            return lowerCaseSubstringWord.equals(substringWord);
        }
    }

    public static void main(String[] args) {
//        String word = "USA";
        String word = "FlaG";
        boolean isDetect = new Solution().detectCapitalUse(word);
        System.out.println("Res = " + isDetect);
    }
}
