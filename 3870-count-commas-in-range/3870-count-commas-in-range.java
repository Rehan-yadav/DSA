class Solution {
    public int countCommas(int n) {
        int num=n;
        int dig=0;
        while(num!=0){
            dig++;
            num/=10;
        }
        if(dig<=3) return 0;
        int ans=0;
        for(int i=1000 ; i<=n ; i++){
            ans++;

        }
        return ans;
    }
}