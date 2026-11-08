class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        String str="";
        for(int i=0 ; i<n ; i++){
            int ch=s.charAt(i);
            if((ch>=65 && ch<=90) || (ch>=97 && ch<=122) || (ch>=48 && ch<=57)){
                str+=Character.toLowerCase(s.charAt(i));
            }
    }
    int i=0,j=str.length()-1;
    while(i<=j){
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }
        i++;
        j--;
    }
    return true;
    

    }
}