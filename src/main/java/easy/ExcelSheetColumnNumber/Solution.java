package easy.ExcelSheetColumnNumber;

public class Solution {
    public int titleToNumber(String s) {
        int total = 0;
        for (int currentPos = 0; currentPos < s.length(); ++currentPos) {
            total = total * 26 + s.charAt(currentPos) - '@';
        }
        return total;
    }

    public static void main(String[] args) {
        String s = "AAA";
        System.out.println("Res = " + new Solution().titleToNumber(s));
    }
}
