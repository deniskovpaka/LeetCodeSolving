package dp;

public class NumbersSum {
    public int[] paidStaircase(int n, int[] p) {
        int[] dp = new int[n + 1];
        int[] from = new int[n + 1];
        dp[0] = 0;
        dp[1] = p[1];
        for (int i = 2; i <= n; ++i) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + p[i];
            if (dp[i - 1] < dp[i - 2]) {
                from[i] = i - 1;
            } else {
                from[i] = i - 2;
            }
        }

        int[] path = new int[n + 1];
        for (int i = n, j = 0; i >= 0; --i, ++j) {
            path[j] = from[i];
        }
        return path;
    }

    public static void main(String[] args) {
        int n = 8;
        int[] p = {0, 3, 2, 4, 6, 1, 1, 5, 3};
        System.out.println("Res = " + new NumbersSum().paidStaircase(n, p));
    }
}
