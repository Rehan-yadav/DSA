class Solution {
    public int specialArray(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
       int low=0,high=n;
       while(low<=high){
        int mid=low+(high-low)/2;
        int count=0;
        for(int j=0 ; j<n; j++){
            if(nums[j]>=mid){
                count++;
            }
        }
        if(count==mid) return mid;
        else if(count<mid){
            high=mid-1;
        }
        else{   
            low=mid+1;
        }
       }
       return -1;
    }
}