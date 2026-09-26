class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0; i<n ; i++){
            int val=nums[i];
            int ind=i;
            int sum=0;
            while(val!=0){
                int rem=val%10;
                sum+=rem;
                val/=10;
            }
            if(sum==ind) return ind;
        }
        return -1;
    }
}