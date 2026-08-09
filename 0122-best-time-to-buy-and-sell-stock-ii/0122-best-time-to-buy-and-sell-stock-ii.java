class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0;
        int i=0,j=1;
        int profit=0;
        while(i<n && j<n){
            if(prices[j]>=prices[i]){
                profit=prices[j]-prices[i];
                max+=profit;
                i++;
                j++;
            }
            else{
                j++;
                i++;
            }
        }
        return max;
    }
}