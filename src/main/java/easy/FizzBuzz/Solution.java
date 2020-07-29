package easy.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzz = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzz.add(FIZZ + BUZZ);
            } else if (i % 3 == 0) {
                fizzBuzz.add(FIZZ);
            } else if (i % 5 == 0) {
                fizzBuzz.add(BUZZ);
            } else {
                fizzBuzz.add(Integer.toString(i));
            }
        }
        return fizzBuzz;
    }

    // Output:
    // [
    //    "1",
    //    "2",
    //    "Fizz",
    //    "4",
    //    "Buzz",
    //    "Fizz",
    //    "7",
    //    "8",
    //    "Fizz",
    //    "Buzz",
    //    "11",
    //    "Fizz",
    //    "13",
    //    "14",
    //    "FizzBuzz"
    //]
    public static void main(String[] args) {
        int n = 15;
        List<String> res = new Solution().fizzBuzz(n);
        System.out.println("Res = " + res);
    }
}
