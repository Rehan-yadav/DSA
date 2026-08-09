class Solution {
    public double minPrice(int[] prices, int[] discounts) {
     Arrays.sort(prices);
     Arrays.sort(discounts);
     double ans=0;
     int n=prices.length;
     int m=discounts.length;
     int i=n-1,j=m-1;
     while(i>=0 && j>=0){
        double cal=(100-discounts[j])/100.0;
        ans+=(double)prices[i]*cal;
        i--;
        j--;
     }
     while(i>=0){
        ans+=prices[i];
        i--;
     }
     return ans;

    }
}