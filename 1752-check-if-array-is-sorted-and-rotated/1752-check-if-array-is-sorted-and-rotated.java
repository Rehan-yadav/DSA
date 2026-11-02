class Solution {
    public boolean check(int[] arr) {
       int n=arr.length;
       int st=0;
       for(int i=0 ; i<n-1 ; i++){
        if(arr[i]<=arr[i+1]){
            continue;
        }
        else{
            st=i+1;
            break;
        }
       }
       int ans[]=new int[n];
       int k=0;
       for(int i=st ; i<n ; i++){
        ans[k]=arr[i];
        k++;
       }
       for(int i=0 ; i<st ; i++){
        ans[k]=arr[i];
        k++;
       }
       for(int i=0 ; i<n-1 ; i++){
        if(ans[i]<=ans[i+1]){
            continue;
        }
        else{
            return false;
        }
       }
       return true;
    }
}