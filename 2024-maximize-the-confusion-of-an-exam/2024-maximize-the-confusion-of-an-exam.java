class Solution {
    static boolean check(String s,int mid,int k){
        int tcount=0,fcount=0;
        for(int i=0 ; i<mid ; i++){
            if(s.charAt(i)=='T') tcount++;
            else fcount++;
        }
        if(Math.min(fcount,tcount)<=k) return true;
        for(int i=mid ; i<s.length() ; i++){
            if(s.charAt(i)=='T') tcount++;
            else fcount++;

            if(s.charAt(i-mid)=='T') tcount--;
            else fcount--;

            if(Math.min(tcount,fcount)<=k) return true;
        }
        return false;
    }
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n=answerKey.length();
        int low=1,high=n;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(answerKey,mid,k)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}