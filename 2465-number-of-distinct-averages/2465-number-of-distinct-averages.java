class Solution {
    public int distinctAverages(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int i=0,j=n-1;
        HashSet<Double> ans=new HashSet<>();
        while(i<j){
            double num=nums[i];
            double avg=(num+nums[j])/2;
            ans.add(avg);
            i++;
            j--;
        }
        return ans.size();
    }
}