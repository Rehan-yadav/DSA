class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int low=0,high=m-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int max=0;
            int ind=0;
            for(int i=0; i<n ; i++){
                if(mat[mid][i]>max){
                    max=mat[mid][i];
                    ind=i;
                }
            }
            int top=-1,bottom=-1;
            if(mid>0) top=mat[mid-1][ind];
            if(mid<m-1) bottom=mat[mid+1][ind];
            if(mat[mid][ind]>top && mat[mid][ind]>bottom){
                return new int[]{mid,ind};
            }
            else if(mat[mid][ind]<top){
                high=mid-1;
            }
            else{
                low=mid+1;
            }


        }
        return new int[]{-1,-1};

    }
}