class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        for(int i=0 ; i<n; i++){
            set.add(nums[i]);
        }
        int len=0;
        int mlen=0;
        for(int x : set){
            if(set.contains(x-1)){
                continue;
            }
            else{
                len++;
                int num=x;
                while(set.contains(num+1)){
                    len++;
                    num++;
                }
                mlen=Math.max(mlen,len);
                len=0;
            }
        }
        return mlen;
    }
}