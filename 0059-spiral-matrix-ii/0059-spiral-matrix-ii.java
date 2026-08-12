class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];
        int srow=0;
        int scol=0;
        int lrow=n-1;
        int lcol=n-1;
        int assign=1;
        while(srow<=lrow){
            for(int j=scol ; j<=lcol ; j++){
                ans[srow][j]=assign;
                assign++;
            }
            for(int i=srow+1 ; i<=lrow ; i++){
                ans[i][lcol]=assign;
                assign++;
            }
            for(int j=lcol-1 ; j>=scol ; j--){
                if(srow==lrow) break;
                ans[lrow][j]=assign;
                assign++;
            }
            for(int i=lrow-1 ; i>srow ; i--){
                if(scol==lcol) break;
                ans[i][scol]=assign;
                assign++;
            }
            srow++;
            scol++;
            lrow--;
            lcol--;
        }
        return ans;
    }
}