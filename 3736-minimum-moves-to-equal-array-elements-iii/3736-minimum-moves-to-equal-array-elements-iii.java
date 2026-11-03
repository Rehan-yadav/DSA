class Solution {
    public int minMoves(int[] nums) {
        int ans=0;
        int n=nums.length;
        int max=nums[0];
        for(int i=0 ; i<n ; i++){
            max=Math.max(max,nums[i]);
        }
        for(int i=0 ; i<n ; i++){
            ans+=max-nums[i];
        }
        return ans;
    }
}