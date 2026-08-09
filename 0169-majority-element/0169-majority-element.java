class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int ans=0;
        int count=0;
        for(int i=0 ; i<n ; i++){
            if(count==0){
                ans=nums[i];
                count++;
            }
            else if(ans==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return ans;
        
        
        // HashMap<Integer,Integer> map=new HashMap<>();
        // int n=nums.length;
        // for(int i=0 ; i<n ; i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        //     if(entry.getValue()>n/2) return entry.getKey();
        // }
        // return 0;
    }
}