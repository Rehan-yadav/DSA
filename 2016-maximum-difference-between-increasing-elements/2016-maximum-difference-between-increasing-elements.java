class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int max=-1;
        int min=nums[0];
        for(int i=0 ; i<n ; i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]!=min){
                max=Math.max(max,nums[i]-min);
            }
            
        }
        return max;
    }
}