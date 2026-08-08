class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0 ; i<n ; i++){
            minprice=Math.min(minprice,prices[i]);
            maxprofit=Math.max(maxprofit,prices[i]-minprice);
        }
        return maxprofit;

        
        
        
        
        
        
        
        
        
        // int maxi=-1;
        // int max=0;
        // for(int i=0 ; i<n ;i++){
        //         maxi=-1;
        //     for(int j=i+1 ; j<n ; j++){
        //         maxi=Math.max(maxi,prices[j]);
        //     }
        //     max=Math.max(max,maxi-prices[i]);
        // }
        // return max;
    }
}