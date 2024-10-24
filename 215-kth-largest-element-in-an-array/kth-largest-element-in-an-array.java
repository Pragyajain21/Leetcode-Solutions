class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int  x : nums)
        {
            pq.add(x);
            while(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}