package easy.ValidParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    private Map<Character, Character> characterMap = new HashMap<>();

    public Solution() {
        characterMap.put(')', '(');
        characterMap.put(']', '[');
        characterMap.put('}', '{');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (characterMap.containsKey(c)) {
                char currentChar = stack.empty() ? '#' : stack.pop();
                if (currentChar != characterMap.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String s = "(((())))";
        System.out.println("Res = " + new Solution().isValid(s));
    }
}
