package easy.AddStrings;

public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int minStringLength = Math.min(num1.length(), num2.length());
        int currentPos = 0;
        int remainder = 0;
        while (minStringLength > currentPos) {
            int n1 = num1.charAt(num1.length() - 1 - currentPos) - '0';
            int n2 = num2.charAt(num2.length() - 1 - currentPos) - '0';
            int sum = n1 + n2 + remainder;
            remainder = 0;
            if (sum >= 10) {
                remainder = 1;
                sum = sum % 10;
            }
            res.append(sum);
            ++currentPos;
        }
        addLeftString(num1, currentPos, remainder, res);
        addLeftString(num2, currentPos, remainder, res);
        if ((res.charAt(res.length() - 1) - '0' == 0 || num1.length() == num2.length()) && remainder > 0) {
            res.append(remainder);
        }
        return res.reverse().toString();
    }

    private void addLeftString(String leftString, int currentPos, int remainder, StringBuilder res) {
        while (currentPos < leftString.length()) {
            int currentValue = leftString.charAt(leftString.length() - 1 - currentPos) - '0';
            int sum = currentValue + remainder;
            remainder = 0;
            if (sum >= 10) {
                remainder = 1;
                sum = sum % 10;
            }
            res.append(sum);
            ++currentPos;
        }
    }

    public static void main(String[] args) {
        String num1 = "9";
        String num2 = "9";
        System.out.println("Res = " + new Solution().addStrings(num1, num2));
    }
}
