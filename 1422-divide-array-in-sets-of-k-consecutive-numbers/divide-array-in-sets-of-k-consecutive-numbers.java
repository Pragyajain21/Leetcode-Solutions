class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        int n = nums.length;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        while(map.size()>0)
        {
            int key = map.firstKey();
            for(int i=key;i<key+k;i++){
                if(!map.containsKey(i))
                return false;
                int val = map.get(i);
                if(val == 1)
                map.remove(i);
                else
                map.put(i,val-1);
            }
        }
        return true;

    }
}