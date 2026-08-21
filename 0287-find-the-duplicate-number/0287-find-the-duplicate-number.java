class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int low=1,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int min=0;
            for(int i=0 ; i<n ; i++){
                if(nums[i]<=mid) min++;
            }
            if(min<=mid){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}