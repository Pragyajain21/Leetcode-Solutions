class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int n=cards.length;
        
        int j=0;
        int ans  = Integer.MAX_VALUE;
        while(j<n)
        {
            if(map.containsKey(cards[j])){
                ans = Math.min(ans,j-map.get(cards[j])+1);
            }
            map.put(cards[j],j);
            j++;
        }
        if(ans==Integer.MAX_VALUE)
        return -1;
        else
        return ans; 

        
    }
}