class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int i=0,j=0;
        while(i<n && j<n){
            if(nums[j]==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        System.out.print(i);
        j=0;
        while(i<n && j<n){
            if(nums[j]==1){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
            else{
                j++;
            }
        }

    }
}