class Solution {
    static boolean check(int[] arr,int mid,double hour){
        double time=0;
        for(int i=0 ; i<arr.length-1; i++){
           time += Math.ceil((double) arr[i] / mid);
        }
         time+=(double)arr[arr.length-1]/mid;
        if(time<=hour) return true;
        else return false;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        int n=dist.length;
        if(hour<=n-1) return -1;
        int max=0;
        for(int i=0 ; i<n ; i++){
            max=Math.max(max,dist[i]);
        }
        int low=1,high=10000000;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(dist,mid,hour)){
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