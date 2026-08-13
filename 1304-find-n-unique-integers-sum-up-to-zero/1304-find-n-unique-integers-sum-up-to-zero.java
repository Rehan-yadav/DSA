class Solution {
    public int[] sumZero(int n) {
        int[] ans=new int[n];
        int put=2;
        if(n%2==0){
            for(int i=0 ; i<n/2 ; i++){
                ans[i]=put;
                ans[n-1-i]=-put;
                put++;
            }
        }
        else{
            for(int i=0 ; i<=n/2 ; i++){
                if(i==n/2){
                    ans[n/2]=0;
                    continue;
                }
                ans[i]=put;
                ans[n-1-i]=-put;
                put++;
            }
        }
        return ans;
    }
}