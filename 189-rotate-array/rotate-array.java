class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int arr1[] = new int[n-k];
        int arr2[] = new int[k];
        for(int i=0;i<nums.length-k;i++){
            arr1[i]=nums[i];
        }
        for(int j=0;j<k;j++){
            arr2[j]=nums[nums.length-k+j];
        }
        for(int i=0;i<k;i++){
            nums[i]=arr2[i];
        }

        for(int j=0;j<arr1.length;j++){
            nums[k+j]=arr1[j];
        }
        
    }
}