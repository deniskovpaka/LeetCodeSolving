package medium.SimplifyPath;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        List<String> skip = List.of("..", ".", "");
        for (String word : path.split("/")) {
            if (word.equals("..") && !stack.isEmpty()) {
                stack.pop();
            } else if (!skip.contains(word)) {
                stack.push(word);
            }
        }
        String res = "";
        for (String dir : stack) res = "/" + dir + res;
        return res.isEmpty() ? "/" : res;
    }
}
