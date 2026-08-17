class Solution {
    static int cal(int[] arr, int mid){
        int hour=0;
        for(int i=0 ; i<arr.length ; i++){
            hour+=Math.ceil((double)arr[i]/mid);

        }
        return hour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=0;
        for(int i=0 ; i<n ; i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        int low=1,high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            int hour=cal(piles,mid);
            if(hour<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}