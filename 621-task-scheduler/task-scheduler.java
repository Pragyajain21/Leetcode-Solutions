class Solution {
    public int leastInterval(char[] tasks, int n) {
         int arr[]=new int[26];
         for(char ch:tasks){
            arr[ch-'A']++;
         }
         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
         for(int freq:arr )
         {
            if(freq>0)
            {
                pq.add(freq);
            }
         }
         int time = 0;
         while(!pq.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for(int i=1;i<=n+1;i++){
                if(!pq.isEmpty()){
                    int freq  = pq.peek();
                    pq.poll();
                    freq--;
                    temp.add(freq); 

                }
            }
            for(int f:temp){
                if(f>0)
                pq.add(f);
            }
            if(pq.isEmpty()){
                time+=temp.size();
            }else{
                time=time+n+1;
            }
         }
         return time;
    }
}