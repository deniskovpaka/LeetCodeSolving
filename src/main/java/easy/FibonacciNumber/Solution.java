package easy.FibonacciNumber;

public class Solution {
    public int fib(int N) {
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        }
        return fib(N - 1) + fib(N - 2);
    }

    public static void main(String[] args) {
        int fib = new Solution().fib(7);
        System.out.println("Fibonacci number: " + fib);
    }
}
