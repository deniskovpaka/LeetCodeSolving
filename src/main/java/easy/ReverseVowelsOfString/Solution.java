package easy.ReverseVowelsOfString;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    private Set<Character> vowels = new HashSet<>();

    public Solution() {
        vowels.add('A');
        vowels.add('a');
        vowels.add('E');
        vowels.add('e');
        vowels.add('I');
        vowels.add('i');
        vowels.add('O');
        vowels.add('o');
        vowels.add('U');
        vowels.add('u');
    }

    public String reverseVowels(String s) {
        String reverseVowels = getVowels(s)
                .reverse()
                .toString();

        StringBuilder res = new StringBuilder();
        for (int i = 0, j = 0; i < s.length(); ++i) {
            if (vowels.contains(s.charAt(i))) {
                res.append(reverseVowels.charAt(j++));
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }

    private StringBuilder getVowels(String s) {
        StringBuilder vowelsInStr = new StringBuilder();
        s.chars()
                .mapToObj(c -> (char) c)
                .filter(character -> vowels.contains(character))
                .forEach(vowelsInStr::append);
        return vowelsInStr;
    }

    public static void main(String[] args) {
//        String s = "leetcode"; // leotcede
        String s = "hello"; // holle
        String res = new Solution().reverseVowels(s);
        System.out.println("Res = " + res);
    }
}
