class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        boolean notpresent=true;
        List<Integer> ans=new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        for(int i=min ; i<max ;i++){
            notpresent=true;
            for(int j=0 ; j<n ; j++){
                if(nums[j]==i){
                    notpresent=true;
                    break;
                }
                else{
                    notpresent=false;
                    
                }
            }
            if(notpresent==false) ans.add(i);
        }
        return ans;
    }
}