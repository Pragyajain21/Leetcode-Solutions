class Solution {
    public long maxKelements(int[] nums, int k) {
        long score = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        while(k>0){
            int val = pq.peek();
            score+= val;
            pq.poll();
            pq.add((int)(Math.ceil(val/3.0)));
            k--;
            
        }
        return score;

    }
}