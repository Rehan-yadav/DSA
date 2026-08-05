class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0 ; i<n ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            max=Math.max(max,entry.getValue());
        }
        return max>1;
    }
}