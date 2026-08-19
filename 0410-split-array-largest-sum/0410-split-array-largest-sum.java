class Solution {
    static int numofsub(int[] arr,int mid){
        int cal=0;
        int num=1;
        for(int i=0 ; i<arr.length ; i++){
            if(cal+arr[i]<=mid){
                cal+=arr[i];

            }
            else{
                num++;
                cal=arr[i];
            }
        }
        return num;
    }
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0 ; i<n ; i++){
            sum+=nums[i];
            max=Math.max(max,nums[i]);
        }
        int low=max,high=sum;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(numofsub(nums,mid)<=k){
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