class Solution {
    static boolean isokay(int[] arr,int mid,int days){
        int req=1;
        int sum=0;
        for(int i=0 ; i<arr.length ; i++){
            if(sum+arr[i]<=mid){
                sum+=arr[i];
            }
            
            else{
                req++;
                sum=arr[i];
            }
            
        }
        if(req<=days) return true;
        else return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int sum=0;
        int max=0;
        for(int i=0 ; i<n ; i++){
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }
        int low=max,high=sum;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isokay(weights,mid,days)==true){
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