class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<List<Integer>> ans=new ArrayList<>();
        int n=intervals.length;
        
        for(int i=0 ; i<n ; i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(ans.isEmpty() || ans.get(ans.size()-1).get(1)<start){
            ans.add(Arrays.asList(start,end)); 
            }
            else{
                int max=Math.max(end,ans.get(ans.size()-1).get(1));
                ans.get(ans.size()-1).set(1,max);
            }

        }
        int[][] mat=new int[ans.size()][2];
        for(int i=0 ; i<ans.size() ; i++){
                mat[i][0]=ans.get(i).get(0);
                mat[i][1]=ans.get(i).get(1);
        }
        return mat;
        
    }
}