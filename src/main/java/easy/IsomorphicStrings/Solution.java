package easy.IsomorphicStrings;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsc(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) == t.charAt(i)) {
                    continue;
                } else return false;
            } else if (map.containsValue(t.charAt(i))) {
                return false;
            } else {
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() == 1) {
            return true;
        }
        Map<Character, Character> characterMap = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            if (characterMap.containsKey(chS)) {
                Character chMap = characterMap.get(chS);
                if (!chMap.equals(chT)) {
                    return false;
                }
            } else if (chS == chT) {
                return false;
            }
            characterMap.put(chS, chT);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        boolean isIsomorphic = new Solution().isIsc(s, t);
        System.out.println("Res = " + isIsomorphic);
    }
}
