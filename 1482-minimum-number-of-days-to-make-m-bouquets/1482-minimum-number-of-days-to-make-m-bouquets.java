class Solution {
    static boolean check(int[] arr,int mid,int m, int k){
        int bouqe=0;
        int cnt=0;
        for(int i=0; i<arr.length ; i++){
            if(arr[i]<=mid){
                cnt++;
                if(cnt>=k){
                    bouqe++;
                    cnt=0;
                }
            }
            else{
                if(cnt==k){
                    bouqe++;
                    cnt=0;
                }
                else{
                    cnt=0;
                }
            }
        }
        if(bouqe>=m) return true;
        else return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int low=1;
        int max=0;
        for(int i=0; i<n ; i++){
            max=Math.max(max,bloomDay[i]);
        }
        int high=max;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(bloomDay,mid,m,k)){
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