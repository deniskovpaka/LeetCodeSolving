package medium.ZigZagConversion;

public class Main {
    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        String res = new Solution().convert(str, 3);
        System.out.println("NumRows = 3, Res = " + res);
        res = new Solution().convert(str, 4);
        System.out.println("NumRows = 4, Res = " + res);
        res = new Solution().convert(str, 2);
        System.out.println("NumRows = 2, Res = " + res);
    }
}
