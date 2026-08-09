class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int oddcount=0;
        int evencount=0;
        if(n==1) return new int[]{0};
        for(int i=0 ; i<n ; i++){
            if(nums[i]%2==0) evencount++;
            else oddcount++;
        }
        for(int i=0 ; i<n ; i++){
            if(nums[i]%2==0){
                ans[i]=oddcount;
                if(evencount!=0){
                    evencount--;
                }
               
            }
            else{
                ans[i]=evencount;
                if(oddcount!=0){
                    oddcount--;
                }
                
            }
        }
        return ans;
        
        
        
        // for(int i=0 ;i<n ; i++){
        //     int count=0;
        //     for(int j=i+1 ; j<n ; j++){
        //         if(nums[i]%2==0){
        //             if(nums[j]%2!=0) count++;
        //         }
        //         else{
        //             if(nums[j]%2==0) count++;
        //         }
        //     }
        //     ans[i]=count;
        // }
        // return ans;
    }
}