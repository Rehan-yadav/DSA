class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        int n=mountain.length;
        List<Integer> ans=new ArrayList<>();
        if(n==1){
            ans.add(mountain[0]);
            return ans;
        }
        for(int i=0 ; i<n ; i++){
            if(i==0){
                continue;
            }
            else if(i==n-1){
                continue;
            }
            else{
                if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]){
                    ans.add(i);
                }
            }
        }
        return ans;
    }
}