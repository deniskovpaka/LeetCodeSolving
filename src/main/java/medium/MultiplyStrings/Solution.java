package medium.MultiplyStrings;

public class Solution {
    public String multiply(String num1, String num2) {
        if ("1".equals(num1)) {
            return num2;
        } else if ("1".equals(num2)) {
            return num1;
        } else if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        int[] res = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; --i) {
            for (int j = num2.length() - 1; j >= 0; --j) {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                product += res[i + j + 1];
                res[i + j + 1] = product % 10;
                res[i + j] += product / 10;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < res.length; ++i) {
            if (res[i] == 0 && stringBuilder.length() == 0) {
                continue;
            }
            stringBuilder.append(res[i]);
        }
        return stringBuilder.toString();
    }
}
