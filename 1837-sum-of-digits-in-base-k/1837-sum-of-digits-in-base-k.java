class Solution {
    public int sumBase(int n, int k) {
        int num=0;
        int ans=0;
        while(true){
            int rem=n%k;
            n=n/k;
            ans+=rem;
            if(n<k) break;
        }
        ans+=n;
        
        return ans;
    }
}