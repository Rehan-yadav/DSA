class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0 ; i<n ; i++){
            sum+=nums[i];
        }
        int cal=n*(n+1)/2;
        return cal-sum;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // int n=nums.length;
        // for(int i=0 ; i<n ; i++){
        //     map.put(nums[i],1);
        // }
        // for(int i=0 ; i<=n ; i++){
        //     if(!map.containsKey(i)) return i;
        // }
        // return 0;
    }
}