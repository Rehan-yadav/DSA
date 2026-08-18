class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1 ; i<=2000 ; i++){
            boolean ispresent=true;
            for(int j=0 ; j<n ; j++){
                if(i!=arr[j]){
                    ispresent=false;
                }
                else{
                    ispresent=true;
                    break;
                }
            }
            if(ispresent==false) ans.add(i);
        }
        return ans.get(k-1);
    }
}