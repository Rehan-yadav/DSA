class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        for(int i=0 ; i<s.length() ;i++){
            char ch=Character.toLowerCase(s.charAt(i));
            int val=ch;
            if(Character.isLetterOrDigit(ch)){
                str.append(ch);
            }
            else {
                continue;
            }
        }
        String st=str.toString();
        int n=st.length();
        for(int i=0 ; i<n/2 ; i++){
            if(st.charAt(i)!=st.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}