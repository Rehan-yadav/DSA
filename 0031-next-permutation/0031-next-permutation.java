class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;
        for(int i=n-1 ; i>0 ;i--){
            if(nums[i-1]<nums[i]){
                ind=i-1;
                break;
            }
        }
                
        if(ind==-1){
            for(int i=0 ; i<n/2 ; i++){
                int temp=nums[i];
                nums[i]=nums[n-1-i];
                nums[n-1-i]=temp;

            }
        }
        else{
            int min=nums[ind+1];
            int mini=ind+1;
            for(int i=ind+1 ; i<n ; i++){
                if(nums[i]<=min && nums[i]>nums[ind]){
                    min=nums[i];
                    mini=i;

                }
            }
            int temp=nums[mini];
            nums[mini]=nums[ind];
            nums[ind]=temp;
            int rev=0;
            for(int i=ind+1 ; i<=(n-1+(ind+1))/2 ; i++){
                int temp1=nums[i];
                nums[i]=nums[n-1-rev];
                nums[n-1-rev]=temp1;
                rev++;
            }
        }
             
        
    }
}