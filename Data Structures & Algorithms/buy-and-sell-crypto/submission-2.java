class Solution {
    public int maxProfit(int[] prices) {
        
        int buy = 0;
        int max = 0;
        for(int sell=1;sell < prices.length;sell++) {
            if(prices[buy] > prices[sell]) {
                buy = sell;
            } else {
                int profit = prices[sell] - prices[buy];
                max = Math.max(max, profit);
            }
        }
        return max;
    }
}