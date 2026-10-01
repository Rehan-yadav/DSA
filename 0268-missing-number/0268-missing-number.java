class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int reqsum=n*(n+1)/2;
        int calsum=0;
        for(int i=0 ; i<n ; i++){
            calsum+=nums[i];
        }
        return reqsum-calsum;
    }
}