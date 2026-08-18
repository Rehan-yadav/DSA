class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       int n=nums1.length;
       int m=nums2.length;
    //    int max=Math.max(nums1[n-1],nums2[m-1]);
    //    int low=1,high=max;
    //    while(low<=high){
    //     int mid=low+high/2
    //    }
    int i=0,j=0;
    while(i<n && j<m){
        if(nums1[i]<nums2[j]){
            i++;
        }
        else if(nums1[i]>nums2[j]){
            j++;
        }
        else{
            return nums1[i];
        }
    }
    return -1;

    }
}