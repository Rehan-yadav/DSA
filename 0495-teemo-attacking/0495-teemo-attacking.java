class Solution {
    public int findPoisonedDuration(int[] arr, int duration) {
        int n=arr.length;
        int ans=duration;
        for(int i=1 ; i<n ; i++){
            if(arr[i]<(arr[i-1]+duration)){
                ans+=arr[i]-arr[i-1];
            }
            else{
                ans+=duration;
            }
        }   
        return ans;
    }
}