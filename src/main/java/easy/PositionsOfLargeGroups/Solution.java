package easy.PositionsOfLargeGroups;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<>();
        if (S == null) {
            return res;
        }
        for (int i = 0; i < S.length(); ++i) {
            char currentChat = S.charAt(i);
            if (i + 2 < S.length() && currentChat == S.charAt(i + 1) && currentChat == S.charAt(i + 2)) {
                List<Integer> consecutiveGroupPosition = calculateConsecutiveGroupPosition(S, i);
                res.add(consecutiveGroupPosition);
                i = consecutiveGroupPosition.get(1);
            }
        }

        return res;
    }

    private List<Integer> calculateConsecutiveGroupPosition(String S, int startPosition) {
        List<Integer> res = new ArrayList<>();
        res.add(startPosition);
        int i = startPosition + 2;
        while (i < S.length() && S.charAt(startPosition) == S.charAt(i)) {
            ++i;
        }
        res.add(--i);
        return res;
    }

    public static void main(String[] args) {
        String s = "abcdddeeeeaabbbcd"; // [[3,5],[6,9],[12,14]]
//        String s = "abbxxxxzzy";
//        String s = "aaa";
        List<List<Integer>> res = new Solution().largeGroupPositions(s);
        res.stream().forEach(System.out::println);
    }
}
