class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList<>();
        long put=1;
        int n=rowIndex+1;
        ans.add(1);
        for(int i=1 ; i<=rowIndex ; i++){
            put=put*(n-i)/i;
            ans.add((int)put);
        }
        return ans;

    }
}