class Solution {
    public void moveZeroes(int[] arr) {
        int n=arr.length;
        int i=0,j=0;
        while(i<n && j<n){
            if(arr[j]==0){
                j++;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
        }
    }
}