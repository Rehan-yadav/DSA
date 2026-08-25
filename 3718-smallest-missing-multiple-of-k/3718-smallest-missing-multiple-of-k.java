class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0 ; i<n ; i++){
            map.put(nums[i],1);
        }
        for(int i=1 ; i<=n+1 ; i++){
            int num=k*i;
            if(map.containsKey(num)){
                continue;
            }
            else{
                return num;
            }
        }
        return 0;
    }
}