class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int low1=0,high1=m-1;
        while(low1<=high1){
            int mid1=low1+(high1-low1)/2;
            if(matrix[mid1][0]==target){
                return true;
            }
            else if(matrix[mid1][0]<target){
                int low=0,high=n-1;
                while(low<=high){
                    int mid=low+(high-low)/2;
                    if(matrix[mid1][mid]==target) return true;
                    else if(matrix[mid1][mid]<target){
                        low=mid+1;
                    }
                    else{
                        high=mid-1;
                    }
                }
                low1=mid1+1;
            }
            else{
                high1=mid1-1;

            }
        }
        return false;
    }
}