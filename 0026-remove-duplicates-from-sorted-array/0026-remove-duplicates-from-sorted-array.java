class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==1) return 1;
        int k=1;
        for(int i=1 ; i<n ; i++){
            if(nums[i-1]!=nums[i]){
                k++;
            }
        }
        int i=0, j=0;
        while(j<n ){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                i++;
                nums[i]=nums[j];
                
            }
        }
        return k;
    }
}