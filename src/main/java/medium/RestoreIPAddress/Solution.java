package medium.RestoreIPAddress;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    private int maxDepth = 4;
    private int[] values = new int[maxDepth];
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new LinkedList<>();
        helper(s, 0, 0, res);
        return res;
    }

    private void helper(String ipString, int currentPosition, int currentDepth, List<String> res) {
        if (currentDepth == maxDepth && currentPosition == ipString.length()) {
            res.add(values[0] + "." + values[1] + "." + values[2] + "." + values[3]);
            return;
        } else if (currentDepth == maxDepth || currentPosition == ipString.length()) {
            return;
        }
        for (int i = 1; i <= 3 && currentPosition + i <= ipString.length(); ++i) {
            int value = Integer.parseInt(ipString.substring(currentPosition, currentPosition + i));
            if(value > 255 || i >= 2  && ipString.charAt(currentPosition) == '0')
                break;
            values[currentDepth] = value;
            helper(ipString, currentPosition + i, currentDepth + 1, res);
            values[currentDepth] = -1;
        }
    }
}
