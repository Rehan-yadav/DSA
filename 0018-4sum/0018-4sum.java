class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        HashSet<List<Integer>> ans=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0 ; i<n ; i++){
            for(int j=i+1; j<n ; j++){
                int k=j+1,l=n-1;
                while(k<l){
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum<target){
                        k++;
                    }
                    else if(sum>target){
                        l--;
                    }
                    else{
                        ans.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                    }
                }
            }
        }
        List<List<Integer>> ans1=new ArrayList<>(ans);
        return ans1;
    
    }
}