class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                int left=-1,right=-1,top=-1,bottom=-1;
                if(i>0) top=mat[i-1][j]; 
                if(i<m-1) bottom=mat[i+1][j];
                if(j>0) left=mat[i][j-1];
                if(j<n-1) right=mat[i][j+1];
                if(mat[i][j]>left && mat[i][j]>right && mat[i][j]>top && mat[i][j]>bottom){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}