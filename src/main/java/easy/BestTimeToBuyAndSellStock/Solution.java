package easy.BestTimeToBuyAndSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        } else {
            int maxProfit = 0;
            for (int i = 0; i < prices.length; ++i) {
                for (int j = prices.length - 1; j > i; --j) {
                    if (maxProfit < prices[j] - prices[i]) {
                        maxProfit = prices[j] - prices[i];
                    }
                }
            }
            return maxProfit;
        }
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // 5
//        int[] prices = {7,6,4,3,1}; // 0
//        int[] prices = {2, 4, 1}; // 2
        int res = new Solution().maxProfit(prices);
        System.out.println("Res = " + res);
    }
}
