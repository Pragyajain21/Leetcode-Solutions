class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i=0;
        int j=0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        while(j<n){
            sum+=nums[j];
            if(sum>=target){
                while(sum>=target){
                    
                ans = Math.min(ans,j-i+1);
                sum-=nums[i];
                i++;
            }
            }
            j++;
            



        }
        if(ans == Integer.MAX_VALUE)
        return 0;
        return ans;
    }
}