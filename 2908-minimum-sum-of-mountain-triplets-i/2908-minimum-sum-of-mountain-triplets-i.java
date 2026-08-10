class Solution {
    public int minimumSum(int[] nums) {
        int max=Integer.MAX_VALUE;
        int n=nums.length;
        int count=0;
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                for(int k=j+1 ; k<n ; k++){
                    if(nums[i]<nums[j] && nums[k]<nums[j]){
                        int sum=nums[i]+nums[j]+nums[k];
                        max=Math.min(max,sum);
                        count++;
                    }
                }
            }
        }
        if(count>0) return max;
        return -1;

    }
}