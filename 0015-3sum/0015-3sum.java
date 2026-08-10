class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        Set<List<Integer>> set=new HashSet<>();
        int ind=0;
        for(int i=0 ; i<n ; i++){
            int j=i+1,k=n-1;
            int target=0-nums[i];
                while(j<k){
                    if(nums[j]+nums[k]>target){
                            k--;
                    }
                    else if(nums[j]+nums[k]<target){
                            j++;
                    }
                    else{
                        set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        k--;
                        j++;
                    }
                }
                
            
        }
        List<List<Integer>> ans=new ArrayList<>(set);
        
        return ans;
    }
}