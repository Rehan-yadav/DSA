class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;
        for(int i=n-1 ; i>0 ; i--){
            if(nums[i]>nums[i-1]){
                ind=i-1;
                break;
            }
        }
        if(ind==-1){
            for(int i=0 ; i<n/2 ; i++){
                int temp=nums[i];
                nums[i]=nums[n-i-1];
                nums[n-i-1]=temp;

            }
            return;
        }
        int mini=0;
        int min=Integer.MAX_VALUE;
        for(int i=ind+1; i<n ; i++){
            if(nums[i]>nums[ind]){
                if(min>nums[i]){
                    min=nums[i];
                    mini=i;
                }
            }
        }
        int temp=nums[mini];
        nums[mini]=nums[ind];
        nums[ind]=temp;
        Arrays.sort(nums,ind+1,n);
    }
}