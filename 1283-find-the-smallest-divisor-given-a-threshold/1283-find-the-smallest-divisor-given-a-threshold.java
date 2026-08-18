class Solution {
    static boolean isdivisor(int[] arr,int mid,int threshold){
        int sum=0;
        for(int i=0 ; i<arr.length; i++){
            sum+=Math.ceil((float)arr[i]/mid);
        }
        if(sum<=threshold) return true;
        else return false;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int max=0;
        for(int i=0 ;i<n ; i++){
            max=Math.max(max,nums[i]);
        }
        int low=0,high=max;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isdivisor(nums,mid,threshold)==true){
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