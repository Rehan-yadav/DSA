class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int[] freq=new int[2002];
        for(int i=0 ; i<n ; i++){
            freq[arr[i]]++;
        }
        int cnt=k;
        for(int i=1 ; i<freq.length ; i++){
            if(freq[i]==0){
                cnt--;
            }
            if(cnt==0) return i;
        }
        return 0;
    }
}