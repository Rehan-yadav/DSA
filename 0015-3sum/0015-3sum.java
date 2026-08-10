class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0 ; i<n ; i++){
            if(i>0  && nums[i]==nums[i-1]) continue;
            int j=i+1,k=n-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]<0){
                    
                    while(j<n-1 && nums[j+1]==nums[j]){
                        j++;
                    }
                    j++;
                }
                else if(nums[i]+nums[j]+nums[k]>0){
                   
                    while(k>0 && nums[k-1]==nums[k]){
                        k--;
                    }
                     k--;
                }
                else{
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    
                    while(j<n-1 && nums[j+1]==nums[j]){
                        j++;
                    }
                    while(k>0 && nums[k-1]==nums[k]){
                        k--;
                    }
                    j++;
                    k--;
                }
            }
        }
        return ans;
    }
}