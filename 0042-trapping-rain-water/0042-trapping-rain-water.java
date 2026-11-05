class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int i=0,j=n-1;
        int maxl=height[0],maxr=height[n-1];
        int ans=0;
        while(i<j){
            if(maxl<maxr){
                i++;
                maxl=Math.max(maxl,height[i]);
                ans+=maxl-height[i];
            }
            else{
                j--;
                maxr=Math.max(maxr,height[j]);
                ans+=maxr-height[j];
            }
        }
        return ans;
    }
}