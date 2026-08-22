class Solution {
    public boolean checkDivisibility(int n) {
        long sum=0;
        long prod=1;
        long num=n;
        while(num!=0){
            int rem=(int)num%10;
            sum+=rem;
            prod*=rem;
            num/=10;
        }
        if(n%(sum+prod)==0) return true;
        else return false;
    }
}