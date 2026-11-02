class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length;
        int ele=arr[0];
        int cnt=1;
        for(int i=1 ; i<n ; i++){
            if(arr[i]==ele){
                cnt++;
            }
            else{
                cnt--;
                if(cnt<0){
                    ele=arr[i];
                    cnt=1;
                }
            }
        }
        return ele;
    }
}