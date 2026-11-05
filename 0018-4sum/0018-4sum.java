class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0 ; i<n ; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n ; j++){
                if(j-1>i && nums[j]==nums[j-1]) continue;
                int k=j+1,l=n-1;
                long req=(long)target-nums[i]-nums[j];
                while(k<l){
                    if(nums[k]+nums[l]==req){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        while(k<l && nums[k+1]==nums[k]) k++;
                        while(l>k && nums[l-1]==nums[l]) l--;
                        k++;
                        l--;
                    }
                    else if(nums[k]+nums[l]<req){
                        k++;
                    }
                    else{
                        l--;
                    }
                }

            }
        }
        return ans;
    }
}