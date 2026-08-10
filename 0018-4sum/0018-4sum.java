class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0 ; i<n ; i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            for(int j=i+1; j<n ; j++){
                if(j>i+1 && nums[j-1]==nums[j]) continue;
                int k=j+1,l=n-1;
                while(k<l){
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum<target){
                        while(k<n-1 && nums[k]==nums[k+1]){
                            k++;
                        }
                        k++;
                    }
                    else if(sum>target){
                        while(l>0 && nums[l-1]==nums[l]){
                            l--;
                        }
                        l--;
                    }
                    else{
                        ans.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        while(k<n-1 && nums[k]==nums[k+1]){
                            k++;
                        }
                        while(l>0 && nums[l-1]==nums[l]){
                            l--;
                        }
                        l--;
                        k++;
                    }
                }
            }
        }
        
        return ans;
    
    }
}