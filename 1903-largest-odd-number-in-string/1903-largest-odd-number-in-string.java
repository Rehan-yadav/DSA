class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        int ind=-1;
        for(int i=n-1 ; i>=0 ; i--){
            int ch=(num.charAt(i)-'0');
            if(ch%2!=0){
                ind=i;
                break;
            }
        }
        if(ind!=-1) return num.substring(0,ind+1);
        else return "";
    }
}