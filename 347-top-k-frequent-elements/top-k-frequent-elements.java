class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[]= new int[k];
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->Integer.compare((int)b.getKey(),(int)a.getKey()));

        for(int i =0 ;i<n;i++){
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            pq.add(new Pair<>(entry.getValue(),entry.getKey()));
        }
        while(k>0){
            Pair p = pq.peek();
            pq.poll();
            ans[k-1] = (int)p.getValue();
            k--;
        }
        return ans;
    }
}