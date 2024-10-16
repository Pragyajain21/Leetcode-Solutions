class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Pair<Integer,Character>> pq = new PriorityQueue<>((x,y)->Integer.compare(y.getKey(),x.getKey()));
        if(a>0){
            pq.add(new Pair<>(a,'a'));
        }
        if(b>0){
            pq.add(new Pair<>(b,'b'));
        }
        if(c>0){
            pq.add(new Pair<>(c,'c'));
        }
        StringBuilder st = new StringBuilder(); 

        while(!pq.isEmpty())
        {
            int currcount = pq.peek().getKey();
            char currchar = pq.peek().getValue();
            pq.poll();
            if(st.length()>=2 && st.charAt(st.length()-1)==currchar && st.charAt(st.length()-2)==currchar)
            {
                if(pq.isEmpty())
                break;
                int nextcnt = pq.peek().getKey();
                char nextchar = pq.peek().getValue();
                pq.poll();
                st.append(nextchar);
                nextcnt--;
                if(nextcnt>0)
                pq.add(new Pair<>(nextcnt,nextchar));
            }else{
                st.append(currchar);
                currcount--;
               
            }
            if(currcount>0)
             pq.add(new Pair<>(currcount,currchar));

        }
        return st.toString();
    }
}