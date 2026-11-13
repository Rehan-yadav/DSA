class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        // if(n==1){
        //     if(arr[0]==1) return 2;
        //     if(arr[0]!=1) return 1;
        // }
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]-(mid+1)<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
       // int missing=arr[low]-k;
        return low+k;
    }
}