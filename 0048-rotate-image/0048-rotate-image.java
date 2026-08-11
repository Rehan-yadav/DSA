class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int[][] ans=new int[n][n];
        int indi=0;
        int indj=n-1;
        for(int i=0 ; i<n ; i++){
            indi=0;
            indj=n-i-1;
            for(int j=0 ; j<n ; j++){
                ans[indi][indj]=matrix[i][j];
                indi++;
                
            }
        }
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                matrix[i][j]=ans[i][j];
            }
        }

    }
}