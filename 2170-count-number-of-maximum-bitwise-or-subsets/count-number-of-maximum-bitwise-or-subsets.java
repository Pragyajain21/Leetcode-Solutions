class Solution {
    public int solve(int i,int nums[],int currOR,int maxOR,int dp[][])
    {
        if(i==nums.length)
        {
            if(currOR == maxOR)
            return 1;
            else
            return 0;
        }
        if(dp[i][currOR]!=-1)
        return dp[i][currOR];

        int take = solve(i+1,nums,(currOR | nums[i]), maxOR,dp);
        int nottake = solve(i+1,nums,currOR,maxOR,dp);
        return dp[i][currOR]= take + nottake;

    }
    public int countMaxOrSubsets(int[] nums) {
        int n = nums.length;
        int maxOR = 0;
        for(int i=0;i<nums.length;i++){
             maxOR = (maxOR | nums[i]);
        }
        int dp[][]=new int[n][maxOR+1];

        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = solve(0,nums,0,maxOR,dp);
        return ans;
    }
}