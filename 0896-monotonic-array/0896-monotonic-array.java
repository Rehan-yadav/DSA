class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        boolean isinc=true;
        for(int i=1 ; i<n ; i++){
            if(nums[i-1]<=nums[i]){
                isinc=true;
            }
            else{
                isinc=false;
                break;
            }
        }
        
        boolean isdec=true;
        for(int i=1 ; i<n ; i++){
            if(nums[i-1]>=nums[i]){
                isdec=true;
            }
            else{
                isdec=false;
                break;
            }
        }
       
        if(isinc==true || isdec==true) return true;
        return false;
    }
}