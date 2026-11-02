class Solution {
    public boolean check(int[] arr) {
       int n=arr.length;
       for(int i=0 ; i<n ; i++){
            int last=arr[n-1];
            for(int j=n-1 ; j>0 ; j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
            boolean issorted=true;
        for(int k=0 ; k<n-1 ; k++){
            if(arr[k]<=arr[k+1]) continue;
            else{
                issorted=false;
                break;
            }
        }
        if(issorted==true) return true;
       }
       return false;
    }
}