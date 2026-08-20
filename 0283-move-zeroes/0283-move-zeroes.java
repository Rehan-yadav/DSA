class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            if(nums[i]==0){
                continue;

            }
            else{
                arr.add(nums[i]);
            }
        }
        for(int i=0 ; i<arr.size() ; i++){
            nums[i]=arr.get(i);
        }
        for(int i=arr.size() ; i<n ; i++){
            nums[i]=0;
        }
    }
}