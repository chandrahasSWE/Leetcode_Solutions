class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer>arr=new LinkedHashSet<>();
        for(int a:nums){
          arr.add(a);
        }
        int i=0;
        for(int it:arr){
            nums[i++]=it;
        }
        return arr.size();
    }
}