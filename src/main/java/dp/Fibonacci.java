package dp;

public class Fibonacci {
    public int fibonacci(int n) {
//        if (n <= 1) {
//            return n;
//        }
//        return fibonacci(n - 2) + fibonacci(n - 1);


        if (n == 0) {
            return 0;
        }
        int[] res = new int[n + 1];
        res[0] = 0;
        res[1] = 1;

        for (int i = 2; i <= n; ++i) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[n];
    }

    public static void main(String[] args) {
        System.out.println("Res = " + new Fibonacci().fibonacci(1));
    }
}
