class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] ans=new int[n];
        int[] freq =new int[51];
        for(int i=0 ; i<n ; i++){
            int count=0;
            freq[A[i]]++;
            freq[B[i]]++;
            for(int j=0 ; j<=50 ; j++){
                if(freq[j]==2) count++;
            }
            ans[i]=count;
        }
        return ans;
        
        
        
        // for(int i=0 ; i<n ; i++){
        //     int count=0;
        //     for(int j=0; j<=i ; j++){
        //         for(int k=0 ; k<=i ;k++){
        //             if(A[j]==B[k]) count++;
        //         }
        //     }
        //     ans[i]=count;
        // }
        // return ans;
    }
}