class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0 ; i<n ; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1 ; j<n ; j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int k=j+1,l=n-1;
                while(k<l){
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        while(k<n-1 && nums[k+1]==nums[k]){
                            k++;
                        }
                        k++;
                        while(l>0 && nums[l-1]==nums[l]){
                            l--;
                        }
                        l--;
                    }
                    else if(sum<target){
                        while(k<n-1 && nums[k+1]==nums[k]){
                            k++;
                        }
                        k++;
                    }
                    else{
                        while(l>0 && nums[l-1]==nums[l]){
                            l--;
                        }
                        l--;
                    }
                }
            }
        }
        return ans;
    }
}