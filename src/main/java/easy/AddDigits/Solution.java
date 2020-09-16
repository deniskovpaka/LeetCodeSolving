package easy.AddDigits;

public class Solution {
    public int addDigits(int num) {
        while ((num = getNums(num)) >= 10);
        return num;
    }

    private int getNums(int num) {
        int temp = 0;
        while (num != 0) {
            temp += num % 10;
            num = num / 10;
        }
        return temp;
    }

    public static void main(String[] args) {
        int num = 19;
        System.out.println("Res = " + new Solution().addDigits(num));
    }
}
