class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int strow=0,stcol=0;
        int lastrow=m-1,lastcol=n-1;
        List<Integer> ans=new ArrayList<>();
        while(strow<=lastrow && stcol<=lastcol){

            //top
            for(int i=stcol ; i<=lastcol ; i++){
                ans.add(matrix[strow][i]);
            }
            //right
            for(int i=strow+1; i<=lastrow ; i++){
                ans.add(matrix[i][lastcol]);
            }
            //bottom
            if(strow<lastrow){
            for(int i=lastcol-1 ; i>=stcol ; i--){
                ans.add(matrix[lastrow][i]);
            }
            }
            //left
            if(stcol<lastcol){
            for(int i=lastrow-1  ; i>stcol ; i--){
                ans.add(matrix[i][stcol]);
            }
            }
            strow++;
            stcol++;
            lastrow--;
            lastcol--;
        }
        return ans;
    }
}