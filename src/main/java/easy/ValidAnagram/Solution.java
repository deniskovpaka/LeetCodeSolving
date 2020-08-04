package easy.ValidAnagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> characterCounter = createCharCounter(s);
        return characterCounter.equals(createCharCounter(t));
    }

    private Map<Character, Integer> createCharCounter(String s) {
        Map<Character, Integer> charCounter = new HashMap<>();
        for (char c : s.toCharArray()) {
            Optional.ofNullable(charCounter.getOrDefault(c, 0))
                    .map(count -> charCounter.put(c, ++count));
        }
        return charCounter;
    }

    public static void main(String[] args) {
//        String s = "anagram";
//        String t = "nagaram";
        String s = "rat";
        String t = "cat";
        boolean isAnagram = new Solution().isAnagram(s, t);
        System.out.println("Res = " + isAnagram);
    }
}
