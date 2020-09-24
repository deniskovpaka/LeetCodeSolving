package easy.PlusOne;

import java.util.stream.Stream;

public class Solution {
    public int[] plusOne(int[] digits) {
        int lastValue = digits[digits.length - 1] + 1;
        if (lastValue > 9) {
            int reminder = 1;
            for (int i = digits.length - 1, temp; i >= 0; --i) {
                temp = digits[i] + reminder;
                if (temp > 9) {
                    reminder = 1;
                    digits[i] = temp % 10;
                } else {
                    digits[i] = temp;
                    reminder = 0;
                    break;
                }
            }
            if (reminder == 1) {
                int[] nArr = new int[digits.length + 1];
                nArr[0] = 1;
                return nArr;
            } else {
                return digits;
            }
        } else {
            digits[digits.length - 1] = lastValue;
            return digits;
        }
    }

    public static void main(String[] args) {
        int[] digits = {1, 9, 9};
        int[] res = new Solution().plusOne(digits);
        Stream.of(res).forEach(System.out::println);
    }
}
