class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int q = queries.length;
        int ans[]=new int[q];
        int prexor[]=new int[n];
        prexor[0] = arr[0];

        for(int i=1;i<n;i++){
            prexor[i]=prexor[i-1]^arr[i];
        }
        for(int j=0;j<q;j++){
            int l = queries[j][0];
            int r = queries[j][1];
            if(l==0)
            ans[j]=prexor[r];
            else
            ans[j]=prexor[r]^prexor[l-1];
           
        }
        return ans;
    }
}