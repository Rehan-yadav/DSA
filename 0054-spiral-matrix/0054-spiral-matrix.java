class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int strow=0,endrow=m-1;
        int stcol=0,endcol=n-1;
        List<Integer> ans=new ArrayList<>();
        while(strow<=endrow && stcol<=endcol){
        //top
        for(int i=stcol ; i<=endcol ; i++){
            ans.add(matrix[strow][i]);
        }
        //right
        for(int i=strow+1 ; i<=endrow ; i++ ){
            ans.add(matrix[i][endcol]);
        }
        //bottom
        if(strow<endrow){
        for(int i=endcol-1 ; i>=stcol ; i--){
            ans.add(matrix[endrow][i]);
        }
        }
        //left
        if(stcol<endcol){
        for(int i=endrow-1 ; i>strow ; i--){
            ans.add(matrix[i][stcol]);
        }
        }
        strow++;
        stcol++;
        endrow--;
        endcol--;
        }
        
        
        return ans;
    }
}