package easy.ConvertNumberToHexadecimal;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String toHex(int num) {
        Map<Integer, String> hexMap = new HashMap<>();
        hexMap.put(10, "a");
        hexMap.put(11, "b");
        hexMap.put(12, "c");
        hexMap.put(13, "d");
        hexMap.put(14, "e");
        hexMap.put(15, "f");
        StringBuilder hex = new StringBuilder();

        if (num == 0) {
            return "0";
        } else if (num > 0) {

            int reminder;
            while (num != 0) {
                reminder = num % 16;
                num = num / 16;
                if (hexMap.containsKey(reminder)) {
                    hex.append(hexMap.get(reminder));
                } else {
                    hex.append(reminder);
                }
            }
            return hex
                    .reverse()
                    .toString();
        } else {
            String result = Integer.toBinaryString(num);
            for (int i = 0; i < result.length(); i += 4) {
                String sub = result.substring(i, i + 4);
                int res = Integer.parseInt(sub, 2);
                if (hexMap.containsKey(res)) {
                    hex.append(hexMap.get(res));
                } else
                    hex.append(res);
            }
            return hex
                    .toString();
        }
    }

    char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public String toHe(int num) {
        if (num == 0) return "0";
        String result = "";
        while (num != 0) {
            int i = num & 15;
            result = map[i] + result;
            int i1 = num >>> 4;
            num = i1;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 26;
//        System.out.println("Res = " + new Solution().toHex(num));
        System.out.println("Res = " + new Solution().toHe(num));
    }
}
