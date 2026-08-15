class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=heights.length;
        String[] ans=new String[n];
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0 ; i<n ; i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int ind=0;
        for(int i=n-1 ; i>=0 ; i--){
            ans[ind]=map.get(heights[i]);
            ind++;
        }
        return ans;
    }
}