class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int tmax=Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            if(nums[i]>max){
                smax=max;
                max=nums[i];

            }
            else{
                if(nums[i]>smax && nums[i]<max){
                    smax=nums[i];
                }
            }
        }
        boolean isthird=false;
        for(int i=0 ; i<n ; i++){
            if(nums[i]>=tmax && nums[i]<smax){
                isthird=true;
                tmax=nums[i];
            }
        }
        if(isthird==true){
            return tmax;
        }
        else return max;
    }
}