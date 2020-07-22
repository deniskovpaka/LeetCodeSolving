package easy.FindWordsThatCanBeFormedCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> charsCounter = createCharCounterMap(chars);
        int countCharacters = 0;
        for (String word : words) {
            Map<Character, Integer> wordCounter = createCharCounterMap(word);
            if (isCharsCounterContainsWord(charsCounter, wordCounter)) {
                countCharacters += word.length();
            }
        }

        return countCharacters;
    }

    private boolean isCharsCounterContainsWord(Map<Character, Integer> charsCounter, Map<Character, Integer> wordCounter) {
        for (Map.Entry<Character, Integer> entry : wordCounter.entrySet()) {
            Integer counter = charsCounter.get(entry.getKey());
            if (counter == null || counter < entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    private Map<Character, Integer> createCharCounterMap(String chars) {
        Map<Character, Integer> charCounter = new HashMap<>();
        for (char c : chars.toCharArray()) {
            Optional.ofNullable(charCounter.getOrDefault(c, 0))
                    .map(count -> charCounter.put(c, ++count));
        }
        return charCounter;
    }

    public static void main(String[] args) {
//        String[] words = {"cat", "bt", "hat", "tree"};
//        String chars = "atach";
        String[] words = {"hello", "world", "leetcode"};
        String chars = "welldonehoneyr";
        int count = new Solution().countCharacters(words, chars);
        System.out.println("Count is = " + count);
    }
}
