class Solution {
    public int countCommas(int n) {
        int num=n;
        int dig=0;
        while(num!=0){
            dig++;
            num/=10;
        }
        if(dig<=3) return 0;
        int ans=n-999;
        return ans;
    }
}