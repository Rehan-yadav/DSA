class Solution {
    public int arrayPairSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int ans=0;
        for(int i=n-1 ; i>0 ; i-=2){
            int min=Math.min(nums[i],nums[i-1]);
            ans+=min;
        }
        return ans;
    }
}