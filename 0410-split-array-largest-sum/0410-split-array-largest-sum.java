class Solution {
    static boolean check(int[] arr, int mid,int k){
        int cnt=1;
        int val=arr[0];
        for(int i=1; i<arr.length; i++){
            if(val+arr[i]<=mid){
                val+=arr[i];

            }
            else{
                cnt++;
                val=arr[i];
            }
        }
        if(cnt<=k) return true;
        else return false;
    }
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int max=-1;
        int sum=0;
        for(int i=0 ; i<n; i++){
            max=Math.max(max,nums[i]);
            sum+=nums[i];
        }
        int low=max;
        int high=sum;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(nums,mid,k)){
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