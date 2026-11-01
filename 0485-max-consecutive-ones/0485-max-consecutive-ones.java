class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n=arr.length;
        int max=0;
        int cnt=0;
        for(int i=0 ; i<n ; i++){
            if(arr[i]==0){
                max=Math.max(cnt,max);
                cnt=0;
            }
            else{
                cnt++;
            }
        }
        max=Math.max(max,cnt);
        return max;
    }
}