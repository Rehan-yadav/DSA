class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int ans1=-1;
        int ans2=-1;
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<target){
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                ans1=mid;
                high=mid-1;
            }
           }
           low=0;
           high=n-1;
            while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<target){
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                ans2=mid;
                low=mid+1;
            }
           }
        
         return new int[]{ans1,ans2};
    }
}