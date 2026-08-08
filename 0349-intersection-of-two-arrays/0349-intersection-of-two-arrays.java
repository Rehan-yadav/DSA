class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> arr=new HashSet<>();
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                arr.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] ans=new int[arr.size()];
        int ind=0;
        for(int x : arr){
            ans[ind]=x;
            ind++;
        }
        return ans;


        // for(int i=0 ; i<nums1.length ; i++){
        //         for(int j=0 ; j<nums2.length ; j++){
        //             if(nums1[i]==nums2[j]){
                        
        //                     arr.add(nums1[i]);
                        
        //             }
        //         }
        // }
    }
}