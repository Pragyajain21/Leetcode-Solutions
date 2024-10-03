class Solution {
    public int minSubarray(int[] nums, int p) {
        int n  = nums.length;
        int ans = n;
        int total = 0;
        for(int x:nums){
            total = (total+x) % p;
        }
        if(total == 0)
        return 0;
        HashMap<Integer,Integer> map  = new HashMap<>();
        map.put(0,-1);
        int curr=0;
        for(int i=0;i<n;i++)
        {
            curr = (curr+nums[i])%p;
            int target = (curr - total + p ) %  p;
            if(map.containsKey(target)){
                ans = Math.min(ans,i-map.get(target));
            }
            map.put(curr,i);
        }
        if(ans == n)
        return -1;
        return ans;

    }
}