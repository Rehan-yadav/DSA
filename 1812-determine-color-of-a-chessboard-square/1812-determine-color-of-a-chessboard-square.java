class Solution {
    public boolean squareIsWhite(String s) {
        int ch1=s.charAt(0)-'a';
        int ch2=s.charAt(1)-'0';
        
            return (ch1+ch2)%2==0;
        
    }
}