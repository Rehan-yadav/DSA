class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        long sum=0;
        long max=0;
        for(int i=0 ; i<k; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            sum+=nums[i];
        }
        if(map.size()==k){
            max=sum;
        }
        int i=0,j=k;
        while(j<n){
                if(map.get(nums[i])==1){
                    map.remove(nums[i]);
                }
                else{
                    map.put(nums[i],map.get(nums[i])-1);
                }
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            sum+=nums[j];
            sum-=nums[i];
            if(map.size()==k){
                max=Math.max(max,sum);
            }
            i++;
            j++;

        }
        return max;
    }
}