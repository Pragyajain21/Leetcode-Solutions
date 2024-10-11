class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        PriorityQueue<Integer> available = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            available.add(i); 
        }
        PriorityQueue<Pair<Integer,Integer>> used = new PriorityQueue<>((a,b)-> Integer.compare(a.getKey(),b.getKey()));
       int newar[][]=new int[n][3];
       for(int i=0;i<n;i++){
        newar[i][0]=times[i][0];
        newar[i][1]=times[i][1];
        newar[i][2]=i; 
       }
       Arrays.sort(newar,(a,b)-> Integer.compare(a[0],b[0]) );
       for(int i=0;i<n;i++)
       {
        int a = newar[i][0];
        int l = newar[i][1];
        int idx = newar[i][2];
        while(!used.isEmpty() && a>=used.peek().getKey()){
            int c = used.poll().getValue();
            available.add(c);
        }
        int chair = available.poll();
        used.add(new Pair<>(l,chair));

        if(idx==targetFriend)
        return chair;
       }
       return -1;
    }
}