class Solution {
    public void moveZeroes(int[] arr) {
        int n=arr.length;
        int i=0,j=0;
        while(i<n && j<n){
            if(arr[j]==0){
                j++;
            }
            else{
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j++;
            }
        }
    }
}