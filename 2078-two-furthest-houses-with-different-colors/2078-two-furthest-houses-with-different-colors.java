class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int max=0;
        for(int i=1 ; i<n ; i++){
            if(colors[0]!=colors[i]){
                max=i;
            }
        }
        for(int i=n-2; i>=0 ; i--){
            if(colors[n-1]!=colors[i]){
                max=Math.max(max,n-1-i);
            }
        }

        
        
        
        
        // for(int i=0 ;i<n ; i++){
        //     for(int j=i ; j<n ; j++){
        //         if(colors[i]!=colors[j]){
        //             max=Math.max(max,j-i);
        //         }
        //     }
        // }
        return max;
    }
}