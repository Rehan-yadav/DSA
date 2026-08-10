class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int diff;
        int ans=0;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                for(int k=j+1; k<n ; k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    diff=Math.abs(target-sum);
                    
                    if(diff<min){
                        min=diff;
                        ans=sum;
                    }
                }
            }
        }
        return ans;
    }
}