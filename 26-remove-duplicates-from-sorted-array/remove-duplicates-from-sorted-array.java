class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length-1;
        int a=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=nums[i+1]){  
                nums[++a]=nums[i+1];
            }
        }
        return a+1;
    }
}