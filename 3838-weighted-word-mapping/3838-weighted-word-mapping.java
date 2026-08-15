class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n=words.length;
        Character[] alpha=new Character[26];
        for(int i=0 ; i<26 ; i++){
            alpha[i]=(char)(122-i);
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0 ; i<n ; i++){
            String s=words[i];
            int weig=0;
            for(int j=0 ; j<s.length();j++){
                weig+=weights[s.charAt(j)-'a'];
            }
            weig=weig%26;
            ans.append(alpha[weig]);
        }
        
        return ans.toString();
    }
}