class Solution {
    static void reverse(int[] nums,int i,int j){
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
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
            reverse(nums,0,n-1);
            return;
        }
        int min=Integer.MAX_VALUE;
        int mini=0;
        for(int i=ind+1 ; i<n ; i++){
            if(nums[i]<min && nums[i]>nums[ind]){
                min=nums[i];
                mini=i;
            }
        }
        int temp=nums[ind];
        nums[ind]=nums[mini];
        nums[mini]=temp;
        Arrays.sort(nums,ind+1,n);
    }
}