class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> arr=new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                arr.add(nums1[i]);
                i++;
                j++;
            }

        }
        int[] ans1=new int[arr.size()];
        for(int k=0; k<arr.size(); k++){
            ans1[k]=arr.get(k);
        }
        return ans1;
    }
}