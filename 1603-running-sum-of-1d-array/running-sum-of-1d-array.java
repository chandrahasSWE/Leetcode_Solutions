class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0,ind=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[ind++]=sum;
        }
        return nums;
        
    }
}