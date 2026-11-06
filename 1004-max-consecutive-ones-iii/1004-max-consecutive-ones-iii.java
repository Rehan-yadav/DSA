class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        int cnt=0;
        int flip=k;
        int i=0,j=0;
        while(j<n){
            if(nums[j]==1){
                cnt++;
                j++;
            }
            else{
                if(flip>0){
                    cnt++;
                    flip--;
                    j++;
                }
                else{
                    max=Math.max(max,cnt);
                    if(nums[i]==1){
                        cnt--;
                        i++;
                    }
                    else{
                        cnt--;
                        flip++;
                        i++;
                    }

                }
            }
        }


        max=Math.max(max,cnt);
        return max;
    }
}