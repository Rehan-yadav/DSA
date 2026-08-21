class Solution {
    public boolean judgeSquareSum(int c) {
       for(long i=0 ; i*i<=c ; i++){
        long low=0,high=(int)Math.sqrt(c);
        while(low<=high){
            long mid=low+(high-low)/2;
            long sum=i*i + mid*mid;
            if(sum==c) return true;
            else if(sum<c) low=mid+1;
            else high=mid-1;
        }
       }
       return false;
    }
}