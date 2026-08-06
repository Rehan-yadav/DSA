class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n=nums.length;
        int[] ans=new int[2];
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0 ; i<n ; i++){
            map.put(nums[i],i);
        }
        for(int i=0 ; i<n ; i++){
            int check=target-nums[i];
            if(map.containsKey(check) && i!=map.get(check)){
                ans[0]=i;
                ans[1]=map.get(check);
                break;
            }
        }
        return ans;
    }
}