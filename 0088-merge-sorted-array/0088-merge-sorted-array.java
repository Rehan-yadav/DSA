class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i=m-1;
       int j=n-1;
       int k=nums1.length-1;
       while(i>=0 && j>=0 && k>=0){
        if(nums2[j]>=nums1[i]){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
        else{
            nums1[k]=nums1[i];
            i--;
            k--;
        }
       }
       while(j>=0){
        nums1[k]=nums2[j];
        k--;
        j--;
       }

    //    int i=0,j=0;
    //     int[] ans=new int[n+m];
    //     int ind=0;
    //     while(i<m && j<n){
    //         if(nums1[i]<nums2[j]){
    //             ans[ind]=nums1[i];
    //             ind++;
    //             i++;
    //         }
    //         else {
    //             ans[ind]=nums2[j];
    //             ind++;
    //             j++;
    //         }
    //     }
    //     while(i!=m){
    //         ans[ind]=nums1[i];
    //         i++;
    //         ind++;
    //     }
    //     while(j!=n){
    //         ans[ind]=nums2[j];
    //         j++;
    //         ind++;
    //     }
    //     for(int k=0 ; k<nums1.length ;  k++){
    //         nums1[k]=ans[k];
    //     }
    }
}