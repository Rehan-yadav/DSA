class Solution {
    static boolean isday(int[] arr,int mid,int m,int k){
        
        int count=0;
        int bloom=0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]<=mid){
                bloom++;
                if(bloom>=k){
                    count++;
                    bloom=0;
                }
            }
            else{
                if(bloom>=k){
                    count++;
                }
                bloom=0;
            }

        }
        if(count>=m) return true;
        else return false;

    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        long check=(long)m*k;
        if(check>n) return -1;
        int max=0;
        for(int i=0 ; i<n ; i++){
            max=Math.max(max,bloomDay[i]);
        }
        int low=1,high=max;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(isday(bloomDay,mid,m,k)==true){
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