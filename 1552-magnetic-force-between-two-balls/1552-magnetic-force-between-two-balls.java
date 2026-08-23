class Solution {
    static boolean check(int[] arr,long mid,int m){
        int assign=1;
        int last=arr[0];
        for(int i=0; i<arr.length ; i++){
            if(arr[i]-last>=mid){
                assign++;
                last=arr[i];
            }
            else continue;
        }
        if(assign>=m) return true;
        else return false;
    }
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        Arrays.sort(position);
        long low=0,high=position[n-1]-position[0];
        int ans=0;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(check(position,mid,m)){
                ans=(int)mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}