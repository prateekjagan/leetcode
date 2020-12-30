/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

One intresting solution - https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/solution/
*/


class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}
