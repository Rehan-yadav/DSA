class Solution {
    public int repeatedNTimes(int[] nums) {
        int n =nums.length;
        int size = n/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0 ; i<n ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==n/2){
                return entry.getKey();
            }
        }
        return 0;
    }
}