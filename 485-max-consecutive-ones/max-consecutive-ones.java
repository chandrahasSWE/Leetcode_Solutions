class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0;
        int max_cnt=0;
        for(int num:nums){
            if(num==1){
                cnt++;
                max_cnt=Integer.max(cnt,max_cnt);
            }
            else{
                cnt=0;
            }
        }
        return max_cnt;

    }
}