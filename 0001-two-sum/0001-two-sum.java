class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0 ;i<n ;  i++){
            map.put(nums[i],i);
        }
        for(int i=0 ; i<n ; i++){
            int rem=target-nums[i];
            if(map.containsKey(rem)){
                if(i!=map.get(rem)){
                        return new int[]{i,map.get(rem)};
                }
                
            }
        }
        return nums;
        
        //for(int i=0 ; i<n ; i++){
        //     for(int j=i+1 ;j<n ; j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return nums;
    }
}