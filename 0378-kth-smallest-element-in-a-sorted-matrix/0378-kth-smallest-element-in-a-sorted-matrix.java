class Solution {
    static int check(int[][] matrix,int mid){
        int n=matrix.length;
        int small=0;
        for(int i=0 ; i<n ; i++){
            int low=0,high=n-1;
            int ans=n;
            while(low<=high){
                int mid1=low+(high-low)/2;
                if(matrix[i][mid1]>mid){
                    ans=mid1;
                    high=mid1-1;
                }
                else{
                    low=mid1+1;
                }
            }
            small+=ans;
        }
        return small;
    }
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            min=Math.min(min,matrix[i][0]);
            max=Math.max(max,matrix[i][n-1]);
        }
        int low=min,high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(matrix,mid)<=k-1){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}