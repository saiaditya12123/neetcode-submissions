class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int minIndex=0;
        int maxProfit=0;
        for(int i=0;i<=prices.length-1;i++){
           if(prices[i]<min){
               min=prices[i];
               minIndex=i;
           }
           maxProfit=Math.max(maxProfit,prices[i]-min);
        }

        return maxProfit;
    }
}