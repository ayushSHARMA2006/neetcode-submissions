class Solution {
    public int maxProfit(int[] prices) {
        int lowprice = prices[0];
        int totalprofit = 0;
        for (int i = 0 ; i < prices.length ; i++){
            int profit = 0;
            int right = i + 1;
            while(right < prices.length){
               profit = prices[right] - prices[i] ;
               if(profit > totalprofit){
                totalprofit = profit;
            }
                right++;
            }
        }  
        return totalprofit;
    }
}
