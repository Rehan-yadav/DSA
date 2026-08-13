class Solution {

    static int fact(int n){
        int fac=1;
        for(int i=1; i<=n; i++){
            fac*=i;
        }
        return fac;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        
        
        for(int i=0 ; i<numRows ; i++){
            ans.add(new ArrayList<>());
            for(int j=0 ; j<=i ; j++){
                int put;
                if(j==0){
                    put=1;
                    ans.get(i).add(1);
                    continue;
                }
                if(j==i && j!=0){
                    ans.get(i).add(1);
                    continue;
                }
                put=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                ans.get(i).add(put);
            }
        }
        return ans;

    }
}