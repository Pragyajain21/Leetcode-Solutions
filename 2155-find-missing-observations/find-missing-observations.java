class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int k = n+m;
        int ans[] = new int[n];
        int totalSum = mean*k;
        int sum = 0;
        for(int i:rolls){
            sum+=i;
        }
        int remaining = totalSum - sum;

        if(remaining < n || remaining > n*6)
        return new int[]{};
        Arrays.fill(ans,remaining/n);
        remaining = remaining%n;
        for(int i=0;i<remaining;i++){
            ans[i]++;
        }
        return ans;


    }
}