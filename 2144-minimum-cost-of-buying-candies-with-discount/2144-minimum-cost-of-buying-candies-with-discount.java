class Solution {
    public int minimumCost(int[] cost) {
     int n=cost.length;
     Arrays.sort(cost);
     int i=n-1;
     int isfree=0;
     int ans=0;
     while(i>=0){
        
        if(isfree!=2){
            ans+=cost[i];
            isfree++;
            i--;
        }
        if(isfree==2){
            i--;
            isfree=0;
        }
        

     } 
     return ans;  
    }
}