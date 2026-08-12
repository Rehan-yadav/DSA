class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> ans=new ArrayList<>();
        int srow=0;
        int scol=0;
        int lrow=m-1;
        int lcol=n-1;
        while(srow<=lrow && scol<=lcol ){
            //top
            for(int j=scol ; j<=lcol ; j++){
            ans.add(matrix[srow][j]);
        }
        //right
        for(int i=srow+1 ; i<=lrow ; i++){
            ans.add(matrix[i][lcol]);
        }
        //bottom
        for(int j=lcol-1 ; j>=scol ; j--){
            if(srow==lrow){
                    break;
            }
            ans.add(matrix[lrow][j]);

        }
        //left
        for(int i=lrow-1 ; i>srow ; i--){
            if(scol==lcol) break;
            ans.add(matrix[i][scol]);
        }
        srow++;
        lrow--;
        scol++;
        lcol--;

        }
        
        return ans;
    }
}