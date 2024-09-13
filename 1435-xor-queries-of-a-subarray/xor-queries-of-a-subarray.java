class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = queries.length;
        int ans[]=new int[n];
        for(int j=0;j<n;j++){
            int l = queries[j][0];
            int r = queries[j][1];
            int xor = 0;
            for(int i = l;i<=r;i++){
                xor = xor^arr[i];
            }
            ans[j]=xor;
        }
        return ans;
    }
}