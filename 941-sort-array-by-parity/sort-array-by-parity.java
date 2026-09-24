class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even=0;
        int[] ar=new int[nums.length];
        for(int a:nums){
            if(a%2==0)
            {
                ar[even++]=a;
            }
        }
        int odd=even;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                ar[odd++]=nums[i];
            }
        }
        return ar;
        
    }
}