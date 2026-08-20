class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int n=drones.length;
        int min=Integer.MAX_VALUE;
        int ind=-1;
        for(int i=0 ; i<n; i++){
            int x=Math.abs(drones[i][0]-target[0]);
            int y=Math.abs(drones[i][1]-target[1]);
            int dis=x+y;
            if(dis<=drones[i][2]){
                if(dis<min){
                    min=dis;
                    ind=i;
                }
            }
        }
        return ind;
    }
}