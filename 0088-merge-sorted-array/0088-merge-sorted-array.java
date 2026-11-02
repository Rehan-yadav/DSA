class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1;
        int k=nums1.length-1;
        while(i>=0 && j>=0 && k>=0){
            if(nums1[i]>=nums2[j]){
                nums1[k]=nums1[i];
                i--;
                k--;
            }
            else{
                nums1[k]=nums2[j];
                j--;
                k--;
            }
        }
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
        while(i>=0){
            nums1[k]=nums1[i];
            i--;
            k--;
        }
        // int[] ans=new int[m+n];
        // int k=0;
        // while(i<m && j<n){
        //     if(nums1[i]<=nums2[j]){
        //         ans[k]=nums1[i];
        //         i++;
        //         k++;
        //     }
        //     else{
        //         ans[k]=nums2[j];
        //         j++;
        //         k++;
        //     }
        // }
        // while(i<m){
        //     ans[k]=nums1[i];
        //     i++;
        //     k++;
        // }
        // while(j<n){
        //     ans[k]=nums2[j];
        //     j++;
        //     k++;
        // }
        // for(int l=0 ; l<ans.length ; l++){
        //     nums1[l]=ans[l];
        // }
    }
}