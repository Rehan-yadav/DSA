class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans=new int[n+m];
        int i=0,j=0;
        int ind=0;
        while(i<m && j<n){
            if(nums1[i]==nums2[j]){
             ans[ind]=nums1[i];
             i++;
             ind++;
            }
            else if(nums1[i]<nums2[j]){
                ans[ind]=nums1[i];
                i++;
                ind++;

            }
            else{
                ans[ind]=nums2[j];
                j++;
                ind++;
            }

        }
        while(i<m){
            ans[ind]=nums1[i];
            i++;
            ind++;
        }
        while(j<n){
            ans[ind]=nums2[j];
            j++;
            ind++;
        }
        for(int k=0 ; k<nums1.length ; k++){
            nums1[k]=ans[k];
        }

    }
}