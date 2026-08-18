class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        int[] freq=new int[51];
        int count=n-k+1;
        for(int i=0 ; i<count ; i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i ; j<k+i ; j++ ){
                set.add(nums[j]);
            }
            for(int x : set){
                freq[x]++;
            }
        }
        for(int i=50 ; i>=0 ; i--){
            if(freq[i]==1){
                return i;
            }
        }
        return -1;
    }
}