class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0 ; i<n ; i++){
            map.put(nums[i],1);
        }
        while(map.containsKey(original)){
            original=original*2;
        }
        return original;
    }
}