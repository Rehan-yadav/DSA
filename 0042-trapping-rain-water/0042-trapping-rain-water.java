class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] maxl=new int[n];
        int[] maxr=new int[n];
        maxl[0]=0;
        maxr[n-1]=0;
        int ans=0;
        for(int i=1 ; i<n ; i++){
            maxl[i]=Math.max(maxl[i-1],height[i-1]);
        }
        for(int i=n-2 ; i>=0 ; i--){
            maxr[i]=Math.max(maxr[i+1],height[i+1]);
        }
        for(int i=0 ; i<n; i++){
            int hgt=Math.min(maxl[i],maxr[i]);
            if(hgt>height[i]){
                ans+=hgt-height[i];
            }
        }
        return ans;
    }
}