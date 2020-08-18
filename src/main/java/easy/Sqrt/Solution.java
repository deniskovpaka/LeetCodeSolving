package easy.Sqrt;

public class Solution {
    public int mySqrt(int x) {
        long res = 0;
        while (res * res <= x) {
            ++res;
        }
        return (int) (res - 1);
    }

    public static void main(String[] args) {
        int x = 2147395600; // 46340
        int res = new Solution().mySqrt(x);
        System.out.println("Res = " + res);
    }
}
