class Solution {
    public int solve(int i,int nums[],int currOR,int maxOR)
    {
        if(i==nums.length)
        {
            if(currOR == maxOR)
            return 1;
            else
            return 0;
        }
        int take = solve(i+1,nums,(currOR | nums[i]), maxOR);
        int nottake = solve(i+1,nums,currOR,maxOR);
        return take + nottake;

    }
    public int countMaxOrSubsets(int[] nums) {
        int maxOR = 0;
        for(int i=0;i<nums.length;i++){
             maxOR = (maxOR | nums[i]);
        }
        int ans = solve(0,nums,0,maxOR);
        return ans;
    }
}