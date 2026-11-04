class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0,j=n-1;
        int max=0;
        while(i<j){
            int hgt=Math.min(height[i],height[j]);
            int area=hgt*(j-i);
            max=Math.max(max,area);
            if(height[i]>hgt){
                j--;
            }
            else{
                i++;
            }
        }
        return max;
    }
}