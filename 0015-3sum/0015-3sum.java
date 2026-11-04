class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            if(i>0 && nums[i]==nums[i-1] ){
                continue;
            }
            int j=i+1,k=n-1;
            int req=0-nums[i];
            while(j<k){
                if(nums[j]+nums[k]==req){
                    Integer[] arr={nums[i],nums[j],nums[k]};
                    if(ans.isEmpty() || ans.get(ans.size()-1)!=Arrays.asList(arr)){
                    ans.add(Arrays.asList(arr));
                    }
                    while(j<k && nums[j+1]==nums[j]) j++;
                    while(k>0 && nums[k-1]==nums[k]) k--;
                    j++;
                    k--;
                }
                else if(nums[j]+nums[k]<req){
                    j++;
                    
                }
                else{
                    k--;
                    
                }
            }
        }
        return ans;
    }
}