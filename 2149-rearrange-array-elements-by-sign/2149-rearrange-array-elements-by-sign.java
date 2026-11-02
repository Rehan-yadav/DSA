class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=1;
        int[] ans=new int[n];
        for(int k=0 ; k<n ; k++){
            if(nums[k]>0){
                ans[i]=nums[k];
                i+=2;
            }
            else{
                ans[j]=nums[k];
                j+=2;
            }
        }
        return ans;
    }
}