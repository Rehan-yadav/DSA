class Solution {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] arr=new int[m+n];
        int i=0,j=0;
        int ind=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                arr[ind]=nums1[i];
                ind++;
                i++;
            }
            else if(nums1[i]>nums2[j]){
                arr[ind]=nums2[j];
                ind++;
                j++;
            }
            else {
                arr[ind]=nums2[j];
                j++;
                ind++;
            }
        }
        while(i<n){
            arr[ind]=nums1[i];
            i++;
            ind++;
        }
        while(j<m){
            arr[ind]=nums2[j];
            j++;
            ind++;
        }
        int len=arr.length;
        double ans;
        if(len%2==0){
            ans=(arr[len/2]+arr[len/2 -1])/2.0;
        }
        else {
            ans=arr[(len-1)/2];
        }
        return ans;
    }
}