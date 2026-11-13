class Solution {
    static boolean check(int[] arr,int mid,int h){
        long cnt=0;
        for(int i=0 ; i<arr.length ; i++){
            cnt+=(arr[i]+mid-1)/mid;
        }
        if(cnt<=h) return true;
        else return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1;
        int max=0;
        for(int i=0 ; i<n; i++){
            max=Math.max(max,piles[i]);
        }
        int high=max;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(piles,mid,h)){
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