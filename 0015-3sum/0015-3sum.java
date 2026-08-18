class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0 ; i<n ; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1,k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<n-1 && nums[j]==nums[j+1]){
                        j++;
                    }
                    j++;
                    while(k>0 && nums[k]==nums[k-1]){
                        k--;
                    }
                    k--;
                }
                else if(sum<0){
                    while(j<n-1 && nums[j]==nums[j+1]){
                        j++;
                    }
                    j++;
                }
                else{
                    while(k>0 && nums[k]==nums[k-1]){
                        k--;
                    }
                    k--;
                }
            }
        }
        return ans;
    }
}