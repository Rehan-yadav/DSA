class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList<>();
        long res=1;
        int n=rowIndex;
        ans.add(1);
        long div=1;
        for(int i=n ; i>0 ; i--){
            res*=(i);
            res/=div;
            div++;
            ans.add((int)res);
        }
        return ans;
    }
}