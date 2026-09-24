class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer>a=new ArrayList<>();
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                a.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
        }
        int[] arr=new int[a.size()];
        int ind=0;
        for(int it:a){
            arr[ind]=it;
            ind++;
        }
        return arr;
    }
}