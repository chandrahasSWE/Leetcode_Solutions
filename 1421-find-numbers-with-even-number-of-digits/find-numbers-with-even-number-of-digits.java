class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int a:nums){
            int n=a;
            int cnt=0;
            while(n>0){
                int lastd=n%10;
                cnt++;
                n=n/10;
            }
            if(cnt%2==0){
                count++;
            }
        }
        return count;
    }
}