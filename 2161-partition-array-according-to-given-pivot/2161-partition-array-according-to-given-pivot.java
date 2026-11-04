class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        List<Integer> small=new ArrayList<>();
        List<Integer> equall=new ArrayList<>();
        List<Integer> greater=new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            if(nums[i]<pivot){
                small.add(nums[i]);
            }
            else if(nums[i]>pivot){
                greater.add(nums[i]);
            }
            else{
                equall.add(nums[i]);
            }
        }
        int k=0;
        int l=0;
        int m=0;
        int a=small.size();
        int b=equall.size();
        int c=greater.size();
        for(int i=0 ; i<n ; i++){
            if(a!=0){
                nums[i]=small.get(k);
                a--;
                k++;
            }
            else if(b!=0){
                nums[i]=equall.get(l);
                b--;
                l++;
            }
            else{
                c--;
                nums[i]=greater.get(m);
                m++;
            }
        }
        return nums;
    }
}