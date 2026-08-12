class Solution {
    public int thirdMax(int[] nums) {
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int tmax=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0 ; i<n ; i++){
            if(nums[i]>max){
                smax=max;
                max=nums[i];
            }
            else{
                if(nums[i]>smax && nums[i]<max){
                    smax=nums[i];
                }
            }
          
        }
        int ans=Integer.MIN_VALUE;
        boolean isans=false;
        for(int i=0 ; i<n; i++){
            if(nums[i]>=ans && nums[i]<smax){
                isans=true;
                ans=nums[i];
            }
        }
        if(isans==false) return max;
        return ans;
    }
}