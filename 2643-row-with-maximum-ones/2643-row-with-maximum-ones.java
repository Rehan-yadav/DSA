class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int max=0;
        int ind=0;
        
        for(int i=0 ; i<m ; i++){
            Arrays.sort(mat[i]);
            int low=0,high=n-1;
            int count=0;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(mat[i][mid]==0){
                    low=mid+1;
                }
                else{
                    
                    count=n-mid;
                    high=mid-1;
                }
            }
            if(count>max){
                max=count;
                ind=i;
            }
        }
        return new int[]{ind,max};
    }
}