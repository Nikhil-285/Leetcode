class Solution {
    public int maxProfit(int[] prices) {
          //int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                int profit=prices[i+1]-prices[i];
                maxprofit+=profit;
            }
        }
        if(maxprofit>0){
            return maxprofit;
        }else{
            return 0;
        }
    }
}