class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        int mini=300;
        String ans="";
        for(int i=0 ; i<n ; i++){
            int len=strs[i].length();
            mini=Math.min(len,mini);
        }
        int cnt=0;
        for(int i=0 ; i<mini ; i++){
            boolean ispre=true;
            for(int j=0 ; j<n ; j++){
                char ch=strs[0].charAt(i);
                if(strs[j].charAt(i)!=ch){
                    ispre=false;
                    break;
                }
            }
            if(ispre==true){
                cnt++;
            }
            else{
                break;
            }
        }
        return strs[0].substring(0,cnt);
    }
}