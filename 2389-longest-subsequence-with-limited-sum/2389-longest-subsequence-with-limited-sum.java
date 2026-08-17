class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=nums.length;
        int[] pre=new int[n];
        int[] ans=new int[queries.length];
        Arrays.sort(nums);
        pre[0]=nums[0];
        for(int i=1 ; i<n ; i++){
            pre[i]=pre[i-1]+nums[i];
        }
        for(int i=0 ; i<queries.length ; i++){
            int low=0,high=n-1;
            int put=-1;
            while(low<=high){
            int mid=low+(high-low)/2;
            if(pre[mid]<=queries[i]){
                put=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        if(put!=-1){
        ans[i]=put+1;
        }
        else{
            ans[i]=0;
        }
        
        }
        return ans;
    }
}