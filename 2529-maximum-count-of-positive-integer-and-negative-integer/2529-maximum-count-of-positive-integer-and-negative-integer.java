class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int low=0,high=n-1;
        int neg=-1;
        int pos=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=0){
                high=mid-1;
            }
            else{
                neg=mid;
                low=mid+1;
            }
            
        }
        low=0;
        high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<=0){
                low=mid+1;
            }
            else{
                pos=mid;
                high=mid-1;
            }
            
        }
        if(pos!=-1) pos=n-pos;
        if(neg!=-1) neg++;
        if(Math.max(neg,pos)==-1) return 0;
        return Math.max(neg,pos);
    }
}