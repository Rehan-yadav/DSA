class Solution {
    static boolean check(int[] arr,int mid,int days){
        int din=1;
        int last=arr[0];
        for(int i=1 ; i<arr.length ; i++){
            if(last+arr[i]<=mid){
                last+=arr[i];
            }
            else{
                din++;
                last=arr[i];
            }
        }
        if(din<=days) return true;
        else return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        
            int max=0;
            int sum=0;
            for(int i=0 ; i<n; i++){
                max=Math.max(max,weights[i]);
                sum+=weights[i];
            }
            int low=max;
            int high=sum;
            int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(weights,mid,days)){
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