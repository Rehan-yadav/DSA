class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            if(i%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        int oddin=0;
        int evenin=0;
        for(int i=0 ;i<n; i++){
            if(i%2==0){
               nums[i]=even.get(evenin);
                evenin++;
            }
            else{
                nums[i]=odd.get(oddin);
                oddin++;
            }
        }
        return nums;
    }
}