class Solution {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        int i=0,j=0;
        while(i<n && j<n){
            if(arr[j]==arr[i]){
                j++;
            }
            else{
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}