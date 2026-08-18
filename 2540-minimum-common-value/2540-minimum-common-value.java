class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       int n=nums1.length;
       int m=nums2.length;
       Set<Integer> set=new HashSet<>();
       for(int i=0 ; i<n ; i++){
        set.add(nums1[i]);
       }
       for(int i=0 ; i<m ; i++){
        if(set.contains(nums2[i])){
            return nums2[i];
        }
       }
       return -1;
    // int i=0,j=0;
    // while(i<n && j<m){
    //     if(nums1[i]<nums2[j]){
    //         i++;
    //     }
    //     else if(nums1[i]>nums2[j]){
    //         j++;
    //     }
    //     else{
    //         return nums1[i];
    //     }
    // }
    // return -1;

    }
}