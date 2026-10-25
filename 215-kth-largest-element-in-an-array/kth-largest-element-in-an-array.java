class Solution {
    //Time Complexity: O(Nlog(k))
    //Space Complexity: O(K)
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int num:nums){
            p.add(num);
            if(p.size()>k){
                p.poll();
            }
        }
         return p.peek();
    }
}