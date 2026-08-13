class Solution {
    public long removeZeros(long n) {
        long num=0;
        while(n!=0){
            long rem=n%10;
            n/=10;
            if(rem==0) continue;
            num=num*10+rem;
        }
        long rev=0;
        while(num!=0){
            long rem=num%10;
            num/=10;
            rev=rev*10+rem;
        }
        return rev;
    }
}