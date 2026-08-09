class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0 ; i<n ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0 ; i<n ; i++){
            if(arr[i]!=arr[i]*2){
                if(map.containsKey(arr[i]*2)){
                return true;
            }
            }
            else{
                if(map.get(arr[i])>1) return true;
            }
            
        }
        return false;
    }
}