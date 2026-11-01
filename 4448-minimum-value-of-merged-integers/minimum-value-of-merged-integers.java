class Solution {
    public int minMergedInteger(int[] nums) {
        int i=0;
        int mini=Integer.MAX_VALUE;
        if(nums.length==2){
            String n1=String.valueOf(nums[0]);
            String n2=String.valueOf(nums[1]);
            String s=n1+n2;
            int N=Integer.parseInt(s);
            return N;
        }
        while(i<nums.length){
            String n1=String.valueOf(nums[i++]);
            String n2=String.valueOf(nums[i++]);
            String s=n1+n2;
            int N=Integer.parseInt(s);
            mini=Math.min(mini,N);
        }
        return mini;
    }
}