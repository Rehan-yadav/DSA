class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.get(0).add(1);
        if(numRows==1) return ans;
        ans.add(new ArrayList<>());
        ans.get(1).add(1);
        ans.get(1).add(1);
        if(numRows==2) return ans;
        for(int i=2; i<numRows ; i++){
            ans.add(new ArrayList<>());
            int res=1;
            int div=1;
            ans.get(i).add(1);
            for(int j=1 ; j<=i ; j++){
                res*=(i-j+1);
                res/=div;
                div++;
                ans.get(i).add(res);
            }
        }
        return ans;
    }
}