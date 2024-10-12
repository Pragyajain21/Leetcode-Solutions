class Solution {
    public int minGroups(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int interval[]:intervals){
            int start = interval[0];
            int end = interval[1];
            if(!pq.isEmpty() && start>pq.peek()){
                pq.poll();
            }
            pq.add(end);
        }
        return pq.size();


    }
}