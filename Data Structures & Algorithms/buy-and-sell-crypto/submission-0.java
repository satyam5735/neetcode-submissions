class Solution {
    public int maxProfit(int[] prices) {
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for(int i=0; i<prices.length;i++){
            if(prices[i]<BuyPrice){
                BuyPrice = prices[i];
            }
            else if(prices[i] - BuyPrice > MaxProfit){
                MaxProfit = prices[i] - BuyPrice;
            }
        }
        return MaxProfit;
    }
}
