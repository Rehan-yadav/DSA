class Solution {
    static boolean check(int[] nums,int mid,int threshold){
        int sum=0;
        for(int i=0 ; i<nums.length ; i++){
            sum+=Math.ceil((double)nums[i]/mid);
        }
        if(sum<=threshold) return true;
        else return false;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int max=0;
        for(int i=0 ; i<nums.length ; i++){
            max=Math.max(max,nums[i]);
        }
        int high=max;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(nums,mid,threshold)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}