class Solution {
    public int largestInteger(int num) {
        int count=0;
        int n=num;
        int even_count=0;
        int odd_count=0;
        while(n!=0){
            int rem=n%10;
            if(rem%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
            count++;
            n/=10;
        }
        n=num;
        int[] sign=new int[count];
        for(int i=count-1 ;i>=0 ; i--){
            int rem=n%10;
            if(rem%2==0){
                sign[i]=0;
            }
            else{
                sign[i]=1;
            }
            n/=10;
        }

        int[] even=new int[even_count];
        int[] odd=new int[odd_count];
        int ein=0;
        int oin=0;
        while(num!=0){
            int rem=num%10;
            if(rem%2==0){
                even[ein]=rem;
                ein++;
            }
            else{
                odd[oin]=rem;
                oin++;
            }
            num/=10;
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        ein=even.length-1;
        oin=odd.length-1;

        int ans=0;
        for(int i=0 ; i<count ; i++){
            if(sign[i]==0){
                ans=ans*10+even[ein];
                ein--;
            }
            else{
                ans=ans*10+odd[oin];
                oin--;
            }
        }

        return ans;
    }
}