class Solution {
    public boolean sumGame(String s) {
        int n=s.length();
        int lsum=0,rsum=0;
        int lq=0,rq=0;
        for(int i=0 ; i<n ; i++){
            if(i<n/2){
                if(s.charAt(i)=='?'){
                    lq++;
                    continue;
                }
                else{
                    lsum+=s.charAt(i)-'0';
                }
            }
            else{
                if(s.charAt(i)=='?'){
                    rq++;
                    continue;
                }
                else{
                    rsum+=s.charAt(i)-'0';
                }
            }
        }
        if((lq+rq)%2!=0) return true;
        int sumdiff=lsum-rsum;
        int qdiff=rq-lq;
        return sumdiff*2 != qdiff*9;
    }
}